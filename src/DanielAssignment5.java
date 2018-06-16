/**
 *
 * Written by Daniel de Sao Jose
 *
 * Exercise 13.7 - The Colorable Interface
 * Design an interface named Colorable with a void method named howToColor() .
 * Every class of a colorable object must implement the Colorable interface.
 * Design a class named Square that extends GeometricObject and implements Colorable .
 * Implement howToColor  to display the message Color all four sides .
 * Draw a UML diagram that involves Colorable, Square, and GeometricObject .
 * Write a test program that creates an array of five GeometricObjects.
 * For each object in the array, display its area and invoke its howToColor method if it is colorable.
 *
 */

/**
 * A class representing an object that can be colored.
 * Every class of the colorable object must implment the Colorable interface.
 */
interface Colorable {

    void howToColor();
}

/**
 * A class representing an object that is a shape consisting of sides.
 * Must be extended by the Square class.
 *
 * NOTE: The only way to make an array of GeometricObjects that we can execute the howToColor method is if we also make
 * GeometricObject also implement the Colorable interface.
 *
 */
abstract class GeometricObject implements Colorable {

    abstract public double getArea();

}

/**
 * A class representing a Square geometric shape.
 * Must extend GeometricObject and implement the Colorable interface.
 */

class Square extends GeometricObject implements Colorable {

    // Data fields.
    private double width;
    private double height;


    // Constructor method.
    Square(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Generates output "Color all four sides."
     */
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    /**
     * Return the area of the Square object.
     */
    public double getArea() {
        return (this.height * this.width);
    }
}

public class DanielAssignment5 {

    public static void main (String[] args) {

        // Create an array with a length of 5 of Geometric objects.
        GeometricObject[] array = new GeometricObject[5];

        // Populate the array with Squares (GeometricObject is an abstract class and cannot have objects).
        array[0] = new Square(2.1, 4.7);
        array[1] = new Square(5.3, 6.2);
        array[2] = new Square(1.4,1.9);
        array[3] = new Square(12.0, 25.1);
        array[4] = new Square(3.8, 7.5);

        // Iterate over the array.
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Square at index %d has area of %.2f.", i, array[i].getArea());

            if (array[i] instanceof Colorable) {
                // Check to see if the object implements the Colorable interface.
                System.out.print("Executing the howToColor returns: ");
                array[i].howToColor();

            } else {

                // Prints end of line in case element is not Colorable.
                System.out.println();
            }

        }
    }
}
