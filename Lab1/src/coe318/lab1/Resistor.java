/**
 * A Resistor models an ideal resistor that obeys Ohm's Law.
 *
 * @author Ashwin Sundaresan
 */
package coe318.lab1;

public class Resistor {
    
    // Creates value to store resistance value
    private double resistanceValue; 
    
    // Creates value to store voltage value
    private double voltageValue;

    // Constructor for creating a resistor with a set resistance value
    public Resistor(double resistance) {
        
        // Initializes the resistor value
        resistanceValue = resistance;
    }

    // Getter method to retrieve resistance value
    public double getResistance() {
        
        return resistanceValue;
    }
    
    // Getter method to retrieve voltage value
    public double getVoltage() {

        return voltageValue;
    }

    // Setter method to set the volatge value to be in between a certain limit
    public void setVoltage(double voltage) {
           
        // Check if voltage value is in between limit
        if (voltage <= 50 && voltage >= -50){
            
            // Set the voltage value
            voltageValue = voltage;
        }
        // Print error message if voltage value not in between limit
        else{
            System.out.println("Error: voltage value beyond limit");
        }
    }
    
    // Calculate and return the current value using Ohm's law 
    public double getCurrent() {

        return (voltageValue / resistanceValue);
    }
    
    // Setter method to set the current value to be in between a certain limit
    public void setCurrent(double current) {
        
        // Check if currnt value is in between limit
        if (current <= 5 && current >=-5){
            
            // Check if resistance value is not 0 (avoids division by 0)
            if(resistanceValue != 0){
                
                // Calculate and set voltage based on current
                voltageValue = current * resistanceValue;
            }
            
            // Print error messasge if resistance value is 0
            else{
                System.out.println("Error, resistance value is 0, thus current cannot be set");
            }
        }
        
        // Print error message if current value not in between limit
        else{
            System.out.println("Error: current value beyond limit");
        }
    
    }

    // Calcualte and return the power value
    public double getPower() {
        return (voltageValue * voltageValue) / resistanceValue;
    }

    // Main Function
    public static void main(String[] args) {
        Resistor r1, r2;
        System.out.println("Creating a 50 Ohm resistor (r1)");
        r1 = new Resistor(50.0);
        System.out.println("Its resistance is "
                + r1.getResistance() + " Ohms");
        System.out.println("Its current is "
                + r1.getCurrent() + " Amps");
        System.out.println("Its voltage is "
                + r1.getVoltage() + " Volts");
        System.out.println("Its power is "
                + r1.getPower() + " Watts");
        System.out.println("Creating a 100 Ohm resistor (r2)");
        r2 = new Resistor(100.0);
        System.out.println("Its resistance is "
                + r2.getResistance() + " Ohms");
        System.out.println("Setting r1's current to 10 Amps");
        r1.setCurrent(10.0);
        System.out.println("Setting r1's current to 2 Amps");
        r1.setCurrent(2.0);
        System.out.println("Its current is "
                + r1.getCurrent() + " Amps");
        System.out.println("Its voltage is "
                + r1.getVoltage() + " Volts");
        System.out.println("Its power is "
                + r1.getPower() + " Watts");
        System.out.println("Setting r1's voltage to 90 Volts");
        r1.setVoltage(90.0);
        System.out.println("Setting r1's voltage to 50 Volts");
        r1.setVoltage(50.0);
        System.out.println("Its current is "
                + r1.getCurrent() + " Amps");
        System.out.println("Setting r2's current to 3 Amps");
        r2.setCurrent(3.0);
        System.out.println("Its voltage is "
                + r2.getVoltage() + " Volts");
    }
}



