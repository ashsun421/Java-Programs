package coe318.lab7;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author ashsu
 */
public class UserMain implements UserInterface{
    
    // Creates an arraylist to represent the circuit
    private ArrayList <String> circuit = new ArrayList<>();
    
    // Scanner to get user input
    private Scanner userInput = new Scanner(System.in);

    //Main Method
    public static void main(String[] args) {
        
        // Creates a new user and starts the program
        UserMain user = new UserMain();
        user.start();
    }
    
    // Overrides te run method from the UserInterface interface
    @Override
    public void run(){
        
        boolean status = true;
        
        // While status is true loop runs
        while(status){
            
            // Stores the user input in circuitLine
            String circuitLine = userInput.nextLine();
            
            // If the user input is end, run the end method and end the loop
            if (circuitLine.equals("end")){
                end();
                break;
            }
            
            // If the user input is spice, run the spice command
            else if (circuitLine.equals("spice")){
                System.out.println("\nCircuit");
                System.out.println("-------------");
                spice();
            }
            
            // If neither follow this
            else{
                
                // If the circuitLine contains the letter "v" follow this
                if(circuitLine.contains("v")){
                    
                    // Creates an array that contains the circuitLine split by spaces
                    String[] line = circuitLine.split(" ");
                    
                    // Creates new nodes
                    Node n1 = new Node();
                    Node n2 = new Node();
                    
                    /* Finds the node ID of the inputted nodes from the line 
                    array and sets them to equal the node ID of the new nodes
                    */
                    n1.nodeId = Integer.parseInt(line[1]);
                    n2.nodeId = Integer.parseInt(line[2]);
                    
                    // Creates a new voltage value
                    double voltageInput;
                    
                    // Finds the voltage value from the input and sets it to equal the new voltage value
                    voltageInput = Double.parseDouble(line[3]);
                    
                    // Creates a new voltage source containing these new values
                    VoltageSource v = new VoltageSource(voltageInput, n1, n2);
                    
                    // Adds the new voltage source after it has been toString to the circuit arraylist
                    circuit.add(v.toString());
                    
                    
                }
                
                // If the circuitLine contains the letter "r" follow this
                else if (circuitLine.contains("r")){
                    
                    // Creates an array that contains the circuitLine split by spaces
                    String[] line = circuitLine.split(" ");
                    
                    // Creates new nodes
                    Node n1 = new Node();
                    Node n2 = new Node();
                    
                    /* Finds the node ID of the inputted nodes from the line 
                    array and sets them to equal the node ID of the new nodes
                    */
                    
                    n1.nodeId = Integer.parseInt(line[1]);
                    n2.nodeId = Integer.parseInt(line[2]);


                    // Creates a new resistance value
                    double resistanceInput;
                    
                    // Finds the resistance value from the input and sets it to equal the new resistance value
                    resistanceInput = Double.parseDouble(line[3]);
                    
                    // Creates a new resistor containing these new values
                    Resistor r = new Resistor(resistanceInput, n1, n2);
                    
                    // Adds the new resistor after it has been toString to the circuit arraylist
                    circuit.add(r.toString());
                    
                }
                
            }
            
        }
        
    }
    
    // Method used when "end" is entered
    @Override
    public void end(){
        System.out.println("\nAll Done");
    }
    
    // Method used when "spice" is entered
    @Override
    public void spice(){
        
        // Creates a for loop for the size of the circuit arraylist
        for(int i = 0; i < circuit.size(); i++){
            
            // Iterates through each value and adds them to a new string circ
            String circ = circuit.get(i);
            
            // Prints out these values in their string representation form
            System.out.println(circ);
            
        }
        
    }
    
    // Method to start the program
    @Override
    public void start(){
        display();
        run();
        
    }
    
    // Method that dispalys a message to inform user to start inputting
    @Override
    public void display(){
        System.out.println("Enter the components of your circuit");
    }
    
}
