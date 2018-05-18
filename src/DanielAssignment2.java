/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daniel
 */
public class DanielAssignment2 {
    public static void main(String[] args) {
        
        // Creates a DanielAssignment2MyInteger object n1
        DanielAssignment2MyInteger n1 = new DanielAssignment2MyInteger(5);
        
        // Uses the n1 isntance of the object to identify if the n1 insance methods 
        // isEven or isPrime
        System.out.println("n1 is even? " + n1.isEven());
        System.out.println("n1 is prime? " + n1.isPrime());

        // uses the static method of the class
        System.out.println(
                "15 is prime? " + 
                DanielAssignment2MyInteger.isPrime(15));

        char[] chars = {'3', '5', '3', '9'};
        System.out.println(DanielAssignment2MyInteger.parseInt(chars));

        String s = "3539";
        System.out.println(DanielAssignment2MyInteger.parseInt(s));

        // Creates a DanielAssignment2MyInteger object n2
        DanielAssignment2MyInteger n2 = new DanielAssignment2MyInteger(24);
        
        // Uses the n2 instance of the object to identify if the n1 insance 
        // methods isOdd
        System.out.println("n2 is odd? " + n2.isOdd());

        // Uses the n1 insance of the object to determine if n1 equals n1
        // or if n1 equals the literal 5
        System.out.println("n1 is equal to n2? " + n1.equals(n2));
        System.out.println("n1 is equal to 5? " + n1.equals(5));

        // Uses the static methods isPrime to identify if a number isPrime
        System.out.println(
                "45 is odd? " + 
                DanielAssignment2MyInteger.isOdd(45));   
    }
}