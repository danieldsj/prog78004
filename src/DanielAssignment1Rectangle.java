/**
 *
 * @author Daniel de Sao Jose
 * @version 0.1
 * 
 */
public class DanielAssignment1Rectangle {
    
    // Properties or attributes
    double height;
    double width;
    
    // Constructs or constructors
    
    // Constructor without parameters.
    DanielAssignment1Rectangle() {
        height = 1;
        width = 1;
    };
    
    // Constructor with width and height parameters.
    DanielAssignment1Rectangle(double customWidth, double customHeight) {
        height = customHeight;
        width = customWidth;
    };
    
    public double getArea() {
        /**
         * Return the area of the instance of the Rectangle class.
         */
        return (height * width);
    };
    
    public double getPerimeter() {
        /**
         * REturn the perimeter of the instance of the Rectangle class.
         */
        return (height + width) * 2;
    };
    
    
}
