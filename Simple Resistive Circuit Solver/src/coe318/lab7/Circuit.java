package coe318.lab7;

// Import ArrayList 
import java.util.ArrayList;
/**
 *
 * @author ashsu
 */
public class Circuit {
    
    // Create an ArrayList of the resistor class
    ArrayList<Resistor> resistors = new ArrayList<Resistor>();
    
    // Defines a variable to hold the single instance of the circuit class
    private static Circuit instance = null;
    
    // Method for obtaining the instance of the circuit class
    public static Circuit getInstance() {
        
        // Check if the isntance of the circuit has been created yet (it is null)
        if (instance == null){ 
            
            // If this is the first instance the method has been called, create the single instance of the circuit class
            instance = new Circuit();
        }
        
        // Return the instance of Circuit, either the new one or the existing one
        return instance;
    }
    
    // Constructor
    private Circuit() {
        // Initializes the resistors into the ArrayList of the resistor class
        this.resistors = resistors;
    }

    // Method to add resistors to the resistor ArrayList
    public void add(Resistor r){
        
        // Adds resistor r to the ArrayList of the resistor class
        this.resistors.add(r);
        
    
    }
        
    // Overrides the deafult toString method 
    @Override
    public String toString(){
    
        // Creates new empty string to store components in circuit
        String circuit = new String();
        
        // Creates for loop in size of the resistor ArrayList
        for(int i = 0; i < this.resistors.size(); i++){
            
            // Adds the resistors at index i to the circuit string
            circuit += this.resistors.get(i) + "\n";
        }
        
        // Returns the final circuit string
        return (circuit);
    }
}

