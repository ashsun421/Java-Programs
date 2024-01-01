package coe318.lab6;

/**
 *
 * @author ashsu
 */
public class Node {
    
    // Declares instance variables for the node ID number and total number of nodes
    private int nodeId;
    private static int nodeCount = 0;
    
    // Constructor
    public Node(){
        
        // Intializes the node ID values using the total node count 
        this.nodeId = nodeCount;
        
        // Increment the count
        nodeCount++;
    }
    
    // Override the default toString method
   @Override
   public String toString(){
       
       // Return the unique node ID
       return("" + this.nodeId);
   }
    
    
}
