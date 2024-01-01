package coe318.lab6;

/**
 *
 * @author ashsu
 */
public class Resistor {
    
    // Instance variable for resistance value
    private double resistance;
    
    // Instance varaible for resistor id
    private int resistorId;
    
    // Instance varaible for number of resistors starting at 1
    private static int resistorCount = 1;
    
    // Instance varaibles for nodes attached to resistors
    private Node node1, node2;
    
    // Constructopr
    public Resistor(double resistance, Node node1, Node node2){
        
        // If the resistor value is negative this illegal argument exception is used
        if (resistance < 0){
            throw new IllegalArgumentException("Resistances cannot be negative");
        }
        
        // If the nodes do not exist this illegal argument exception is used
        if (node1 == null || node2 == null){
            throw new IllegalArgumentException("Connecting nodes must exist");
        }
        
        // Sets resistance values and node numbers
        this.resistance = resistance;
        this.node1 = node1;
        this.node2 = node2;
        
        // Initializes the resistor ID using the resistor count
        this.resistorId = resistorCount;
        
        // Increments the resistor count
        resistorCount++;
    }
    
    // Method to get nodes and place them in a array
    public Node[] getNodes(){
        
        // Create an array of nodes that contains the nodes attached ot the resistor
        Node nodes[] = {node1, node2};
        return nodes;
        
    }
    
    // Overrides the deafult toString method 
    @Override
    public String toString(){
        // Outputs the resistor ID, the nodes attached and the resistor value
        return ("R" + resistorId + " " + node1 + " " + node2 + " " + resistance);
        
    }
    
}
