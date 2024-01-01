package coe318.lab7;

/**
 *
 * @author ashsu
 */
public class VoltageSource {
    
    
    // Instance variable for voltage value
    private double voltage;
    
    // Instance variable for voltage Id
    private int voltageId;
    
    // Instance varaible for voltage source count
    private static int voltageCount = 1;
    
    
    // Instance varaibles for nodes attached to voltage source
    private Node node1, node2;
    
    
    // Constructor
    public VoltageSource(double voltage, Node node1, Node node2){
        
        
        // If the nodes do not exist this illegal argument exception is used 
        if (node1 == null || node2 == null){
            throw new IllegalArgumentException("Connecting nodes must exist");
        }
        
        // Initializes the voltage values and node numbers 
        this.voltage = voltage;
        this.node1 = node1;
        this.node2 = node2;
        
        // Initializes the voltage ID using the voltage count
        this.voltageId = voltageCount;
        
        // Increments voltage count by 1
        voltageCount++;
        
        
        if(voltage < 0){
            Node temp = node1;
            node1 = node2;
            node2 = temp;
            voltage = voltage * -1;
        }
        
    }
    
    // Getter method for voltage Id
    public int getId(){ 
        return voltageId;
    }
    
    // Getter method for voltage value
    public double getVoltage(){
        return voltage;
    }
    
    // Method to get nodes and place them in an array
    public Node[] getNodes(){
        
        Node nodes[] = {node1, node2};
        return nodes;
        
    }
    
    // Method that checks whether the voltage vlaue is negative or nto based on the polarity
    public boolean negative(){
        
        Node[] nodes = getNodes();
        return(nodes[0].nodeId > nodes[1].nodeId);
        
    }
    
    @Override
    public String toString(){
        
        return ("V" + voltageId + " " + node1 + " " + node2 + " DC " + voltage);
        
        
    }
    
}
