/**
 * 
 * @author Daniel de Sao Jose
 * @version 1
 * 
 */
public class DanielAssignment2MyInteger {
    
    // The "data" of the object.
    private int value;
    
    /**
     * The constructor that can be used to assign the value.
     * 
     * @param value An integer that will be used as the value of MyInteger.
     */
    DanielAssignment2MyInteger( int value ) {
        this.value = value;
    }
    
    /**
     * Returns the current value.
     * 
     * @return The current value.
     */
    public int getValue() {
        return this.value;
    }
    
    /**
     * Return true if object's value is even.
     * 
     * @return Returns a boolean indicating whether the objects value is even.
     */
    public boolean isEven() {
        return DanielAssignment2MyInteger.isEven(this.getValue());
    }
    
    /**
     * Given a DanielAssignment2MyInstance object, return true if object's 
     * value is even.
     * 
     * @param value A DanielAssignment2MyInteger object.
     * @return A boolean indicating whether the object is even.
     */
    public static boolean isEven( DanielAssignment2MyInteger value ) {
        return DanielAssignment2MyInteger.isEven(value.getValue());
    }
    
    /**
     * Given an int, return true if object's value is even.
     * 
     * @param value An int literal or variable.
     * @return A boolean indicating whether the int is even.
     */
    public static boolean isEven( int value ) {
        if( value % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Return true if object's value is odd.
     * 
     * @return Returns a boolean indicating whether the objects value is odd.
     */
    public boolean isOdd() {
        return DanielAssignment2MyInteger.isOdd(this.value);
    }
    
    /**
     * Given a DanielAssignment2MyInstance object, return true if object's 
     * value is odd.
     * 
     * @param value A DanielAssignment2MyInteger object.
     * @return A boolean indicating whether the object is odd.
     */
    public static boolean isOdd( DanielAssignment2MyInteger value ) {
        return DanielAssignment2MyInteger.isOdd(value.getValue());
    }
    
    /**
     * Given an int, return true if object's value is odd.
     * 
     * @param value An int literal or variable.
     * @return A boolean indicating whether the int is odd.
     */
    public static boolean isOdd( int value ) {
        if (DanielAssignment2MyInteger.isEven(value) == false) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Return true if object's value is prime.
     * 
     * @return Returns a boolean indicating whether the objects value is prime.
     */
    public boolean isPrime() {
        return DanielAssignment2MyInteger.isPrime(this.value);
    }
    
    /**
     * Given a DanielAssignment2MyInstance object, return true if object's 
     * value is prime.
     * 
     * @param value A DanielAssignment2MyInteger object.
     * @return A boolean indicating whether the object is prime.
     */
    public static boolean isPrime( DanielAssignment2MyInteger value ) {
        return DanielAssignment2MyInteger.isPrime(value.getValue());
    }
    
    /**
     * Given an int, return true if object's value is prime.
     * 
     * @param value An int literal or variable.
     * @return A boolean indicating whether the int is prime.
     */
    public static boolean isPrime( int value ) {
        // A prime number cannot be divisible by 2.
        if ( value % 2 == 0) return false;
        if ( value == 2 ) return true;
        if ( value < 2 ) return false;
        for (int i = 3; i * i <= value; i += 2) {
            if ( value % i == 0 ) return false;
        }
        return true;
    }
    
    /**
     * Given an int, compare the given int with the value.
     * 
     * @param value An int to make the comparison.
     * @return A boolean representing whether values are equal.
     */
    public boolean equals( int value ) {
        if (java.lang.Integer.compare(value, this.getValue()) == 0) {
            return true;
        }
        else {
            return false;
        }
        
    }
    
    /**
     * Given a DanielAssignment2MyInteger object, compare the given object 
     * with the value.
     * 
     * @param value A DanielAssignment2MyInteger object to make the comparison.
     * @return A boolean representing whether values are equal.
     */
    public boolean equals( DanielAssignment2MyInteger value ) {
        return this.equals(value.getValue());
    }
    
    /**
     * Given an array of char values, return an int with the value represented 
     * in the array of char values.
     * 
     * @param value An array of char values that will be converted to an int.
     * @return An integer that is an interpretation of the char array values.
     */
    public static int parseInt(char [] value ) {
        return java.lang.Integer.parseInt(java.lang.String.valueOf(value));
    }
    
    /**
     * Given a String value, return an int with the value represented 
     * in the String.
     * 
     * @param value A String value that will be converted to an int.
     * @return An integer that is an interpretation of the String value.
     */
    public static int parseInt(String value) {
        return java.lang.Integer.parseInt(value);
    }
}