
/**
 *
 * @author Ashwin Sundaresan
 */
package coe318.lab3;
public class Counter {
    //Creates instance variables for modulus, left and digit
    
    private int modulus;
    private Counter left;
    private int digit;
    
    // Constructor to create a counter with a modulus and an optional left value
    public Counter(int modulus, Counter left) {
        
        // Initializes value to modulus
        this.modulus = modulus;
        
        // Initializes value to left
        this.left = left; 
        
        // Initializes digit to be 0
        this.digit = 0; 
    }

    /**
     * @return the modulus
     */
    
    // Gets the value for the modulus of the counter
    public int getModulus() {
        return modulus;
    }

    /**
     * Returns the Counter to the left attached to this
     * Counter.  Returns null if there is no Counter
     * to the left.
     * @return the left
     */
    
    // gets the value of the left value of the counter, returns null if no value
    public Counter getLeft() {
        return left;
    }

    /**
     * @return the digit
     */
    
    // Returns the current digit of the counter
    public int getDigit() {
        return digit;
    }

    /**
     * @param digit the digit to set
     */
    
    // Set the digit value of the counter
    public void setDigit(int digit) {
        
        // If the digit value is less than the modulus set the digit value
        if(digit < modulus){
            this.digit = digit;
        }
    }

    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     */
    
    // Function to increment the counter
    public void increment() {
        
        // Digit increases by 1
        digit++;
        
        // If counter rolls over (reaches max value) reset it to 0
        if(digit == modulus){
            digit = 0;
            
            // After reseting, increment the left counter if it exists 
            if(left != null){
                left.increment();
            }
        }
    
    }

    /** Return the count of this Counter combined
     * with any Counter to its left.
     *
     * @return the count
     */
    public int getCount() {
        if(left == null){
            return digit;
        }
        return digit + modulus * left.getCount();
        
    }

    /** Returns a String representation of the Counter's
     * total count (including its left neighbour).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}
