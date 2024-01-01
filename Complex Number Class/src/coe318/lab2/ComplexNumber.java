package coe318.lab2;

/**
 * ComplexNumber models a complex number expressed in rectangular form (real and
 * imaginary parts). It is an <em>immutable</em> object.
 *
 * @author Ashwin Sundaresan
 */
public class ComplexNumber {
//Instance variable declarations
    
    private double re;
    private double im;

    /**
     * Construct a ComplexNumber given its real and imaginary parts.
     *
     * @param re The real component
     * @param im The imaginary component
     */
    public ComplexNumber(double real, double imag) {
    // Initialize the instance variables

        re = real;
        im = imag;
        
    }

    // Getter function that gets the value of the real number and returns it
    public double getReal() {
        return re;	
   
    }

    // Getter function that gets the value of the imaginary number and returns it
    public double getImaginary() {
        return im;	
    }

    // Function to invert the signs of the complex number
    public ComplexNumber negate() {
        
        //Creates a new complex number variable that negates the original complex number
        ComplexNumber negateNumber = new ComplexNumber(-re, -im);
        
        // Returns the negated number
        return negateNumber; 
    }

    // Function to add two complex numbers
    public ComplexNumber add(ComplexNumber z) {
        
        /** Creates a new complex number variable in which the original complex 
         *  number and complex number z are added
         */
        ComplexNumber addNumber = new ComplexNumber(re + (z.re), im + (z.im));
        
        // Returns the added complex number
        return addNumber;
    }

    // Function to subtract two complex numbers
    public ComplexNumber subtract(ComplexNumber z) {
        
        /** Creates a new complex number variable in which the original complex 
         *  number and complex number z are subtracted
         */
        ComplexNumber subNumber = new ComplexNumber(re - (z.re), im - (z.im));
        
        // Returns the subtraced complex number
        return subNumber;
    }   
    
    // Function to multiply two complex numbers
    public ComplexNumber multiply(ComplexNumber z) {
        
        /** Creates a new complex number variable in which the original complex 
         *  number and complex number z are multiplied
         *  This function uses the formula: (a +- ib)(c +- id) 
         */
        ComplexNumber mul = new ComplexNumber(re * z.re - im * z.im, re * z.im + im * z.re);
        
        // Returns the multipled complex number
        return mul;
    }

    // Function to reciprocate the complex number
    public ComplexNumber reciprocal() {
        
        // Determines the magnitude of the complex number
        double mag = re * re + im * im;
        
        /** Divides the original components of the complex number by its 
         *  magnitude and the returned the reciprocated complex number
         * */
        return new ComplexNumber(re / mag, -im / mag);
        
    }
    
    // Function to divide the two complex numbers
    public ComplexNumber divide(ComplexNumber z) {
        
        // Determines the reciprocal of the second complex number
        ComplexNumber recip = z.reciprocal();
        
        /** Multiplies the original complex number by the reciprocal of z in 
         * order to divide the complex numbers
         * */
        ComplexNumber div = multiply(recip);
        
        // Returns the divided number
        return div;	
    }

    /**
     * Returns a String representation of
     * <em>this</em> in the format:
     * <pre>
     *	real +-(optional) i imaginary
     * </pre> If the imaginary part is zero, only the real part is converted to
     * a String. A "+" or "-" is placed between the real and imaginary parts
     * depending on the the sign of the imaginary part.
     * <p>
     * Examples:
     * <pre>
     *	..println(new ComplexNumber(0,0); -> "0.0"
     *	..println(new ComplexNumber(1,1); -> "1.0 + i1.0"
     *	..println(new ComplexNumber(1,-1); -> "1.0 - i1.0"
     * </pre>
     *
     * @return the String representation.
     */
    @Override
    public String toString() {
//DO NOT MODIFY THIS CODE!
        String str = "" + this.getReal();
        if (this.getImaginary() == 0.0) {
            return str;
        }
        if (this.getImaginary() > 0) {
            return str + " + i" + this.getImaginary();
        } else {
            return str + " - i" + -this.getImaginary();
        }
    }
}
