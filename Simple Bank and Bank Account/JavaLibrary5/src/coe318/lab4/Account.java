package coe318.lab4;

/**
 *
 * @author Ashwin Sundarsan
 */
public class Account {
    
    // Declares the instance variables used
    private String name;
    private int number;
    private double initialBalance;
    
    
    // Creates the constructor used to display bank details
    public Account(String name, int number, double initialBalance){
        
        // Sets the variables called in the constructor to the instance variables
        this.name = name;
        this.number = number;
        this.initialBalance = initialBalance;
        
    }
    
    // Getter method that returns the name of the account holder
    String getName(){
        return name;
    
    }
    
    // Getter method that returns the account number
    int getNumber(){
        return number;
        
    }
    
    // Getter method that returns the initial balance of the account
    double getBalance(){
        return initialBalance;
        
    }
      
    // Method to deposit money in bank account
    boolean deposit(double amount){
        
        /** If function that determines whether the amount being deposited is a 
         * real number
         */
        if (amount >= 0){
            
            // Amount is added to the initial balance and is updated
            initialBalance =  initialBalance + amount;
            
            // Returns true 
            return true;
        }
        else{
            // Returns false if amount deposited is not a real number
            return false;
        }
        
  
    }
    
    // Method to withdraw money from the bank account
    boolean withdraw(double amount){
        
        /** If function to determine whether amount withdrawn is a real number 
         *  or not 
         */
        if (amount > 0){
        
            // Creates a variable to store the initial blance in before changes
            double originalBalance = initialBalance;
            
            // Amount is subtracted from initial balance and is update
            initialBalance = initialBalance - amount;
            
            // If the initial balance is greater than 0 returns the new balance 
            if(initialBalance > 0){
                return true;
            }
            
            /** If the initial balance is less than or equal to 0 returns the 
             *  balance before change are made
             */
            else{
                initialBalance = originalBalance;
                return false;
            }
        }
        
        /** Returns false if amount is not a real number or greater than the 
         *  initial balance
         */
        else{
            return false;
        }
     
    }
  

    @Override
        public String toString() {//DO NOT MODIFY
        return "(" + getName() + ", " + getNumber() + ", " +
        String.format("$%.2f", getBalance()) + ")";
    }
}
