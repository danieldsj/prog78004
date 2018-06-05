/*
Written by Daniel de Sao Jose

Requirements:
Write the following method that shuffles the elements in an ArrayList  of integers:
    public static void shuffle(ArrayList<Integer> list)
Write a method that removes the duplicate elements from an array list of integers using the following header:
    public static void removeDuplicate(ArrayList<Integer> list)
Write a test program that prompts the user to enter 10 integers to a list and displays the distinct integers separated
by exactly one space.
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Integer;
import java.util.Random;

public class DanielAssignment3 {

    /**
     * Execute code that exercises the shuffle and removeDuplicate methods.
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Create a reference object for the Scanner class.
        String[] inputStrings = new String[10]; // A variable with individual String objects from input.
        ArrayList inputIntegers = new ArrayList(); // A variable to store the individual int primitives.

        System.out.print("Enter ten integers: "); // Prompt the user for integers.
        inputStrings = ((String)input.nextLine()).split(" "); // Grab the space delimited input.

        // Iterate over the array of strings.
        for(int i=0; i < inputStrings.length; i++) {

            // Convert the strings to int values and add them to the the ArrayList.
            inputIntegers.add(Integer.parseInt(inputStrings[i]));
        }

        // Dedupe the ArrayList object using the specialized method.
        DanielAssignment3.removeDuplicate(inputIntegers);

        // Generate output.
        System.out.print("The distinct integers are ");
        for(int i=0; i < inputIntegers.size(); i++){
            System.out.print(inputIntegers.get(i) + " ");
        }

    }


    /**
     * Shuffles the elements in an ArrayList of integers.
     *
     * @param list
     */
    public static void shuffle(ArrayList list) {

        Random randomizer = new Random(); // Create a reference variable for the Random class.
        int elementNewIndex; // New index of element.
        int elementValue; // The value of the element.

        // iterate over all elements in the ArrayList.
        for(int i=0; i < list.size(); i++) {
            elementNewIndex = randomizer.nextInt(9); // Generate a random new index.
            elementValue = (int) list.get(i); // Get the value of the current element.
            list.add(elementNewIndex, elementValue); // Add the value of the current element to the new random index.
            list.remove(i); // Remove the current element.
        }

    }

    /**
     * Removes the duplicate elements from an array list of integers
     *
     * @param list
     */
    public static void removeDuplicate(ArrayList list) {

        // Iterates over each element in the ArrayList.
        for(int a=0; a < list.size(); a++) {
            int count = 0;

            // Iterates over each element in the ArrayList a second time.
            for(int b=0; b < list.size(); b++) {

                // Check to see if the values are the same.
                if(list.get(a).equals(list.get(b))) {

                    count++; // Increment the counter.

                    // Check to see if the counter is greater than 1.
                    if(count > 1){

                        list.remove(b); // Remove the element if it there is more than one.
                    }
                }
            }
        }
    }
}
