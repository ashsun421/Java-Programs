/**
 *
 * @author Ashwin Sundaresan
 */
package coe318.lab4;

public class Bank {
    private String name;
    /**
     * An array of Accounts managed by
     * this bank.
     */
    private Account [] accounts;
    private int numAccounts;//number of active accounts

    public Bank(String name, int maxNumberAccounts) {
        this.name = name;
        accounts = new Account[maxNumberAccounts];
        numAccounts = 0;
    }


    // Getter method that returns the name of the account holder
    public String getName() {
        return name;  
    }

    // Getter method that returns the number of active accounts 
    public int getNumAccounts() {
        return numAccounts; //Fix this
    }

    // Getter method that returns an array of all accounts managed by the bank
    public Account[] getAccounts() {
        return accounts; //Fix this
    }

    /**
     * Return true if the Bank already has an account
     * with this number; otherwise false.
     * @param accountNumber
     * @return
     */
    public boolean hasAccountNumber(int accountNumber) {
        
        // For loop that runs for however many accounts there are
        for (int i = 0; i < numAccounts; i++){
            
            /** If the account number matches the account number in the accounts 
             *  array at position i return true
             */
            if(accountNumber == accounts[i].getNumber()){
                return true;
            }
        }
            
        /** If the account number does not match the account number in the 
         * accounts array at position i return false
         */
        return false; 
    }

    /**
     * Adds the specified account to the Bank if possible. If the account number
     * already exists or the Bank has reached its maximum
     * number of accounts, return false and do not add it; otherwise,
     * add it and return true.
     * @param account
     * @return true if successful
     */
    public boolean add(Account account) {
        
        // For loop that runs for however many accounts there are
        for (int i = 0; i < numAccounts; i++){
            
            /** If the account number at position i in the accounts array 
             *  matches the account number in the account array return false
             */
            if(accounts[i].getNumber() == account.getNumber()){
                return false;
            }
            
       
        }
        
        // If the max number of accounts is reached for the bank return false
        if(accounts.length == numAccounts){
            return false;
        }
        
        /** Adds the account number to the accounts array with max range of 
         *  numAccounts
         */
        accounts[numAccounts] = account;
        
        // Increment the number of accounts by 1 since new account has been added
        numAccounts++;
       
        // Once account is successfully added return 
        return true; 
    
    }

    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        String s = getName() + ": " + getNumAccounts() +
                " of " + getAccounts().length +
                " accounts open";
        for(Account account : getAccounts()) {
            if (account == null) break;
            s += "\n  " + account;
        }
        return s;
    }
}

