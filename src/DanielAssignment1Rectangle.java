/**
 * Java Class DanielAssignment1Rectangle
 * 
 * @author Daniel de Sao Jose
 * @version 0.1, 2018-05-10
 * 
 */
public class DanielAssignment1Rectangle {
    
    // Properties or attributes
    double height;
    double width;
    
    /**
     * Constructor to be used without parameters.
     */
    DanielAssignment1Rectangle() {
        height = 1;
        width = 1;
    };
    
    /**
     * Constructor to be used when specifying width and height.
     * 
     * @param customWidth
     * @param customHeight 
     */
    DanielAssignment1Rectangle(double customWidth, double customHeight) {
        height = customHeight;
        width = customWidth;
    };
    
    /**
     * Returns the area of the rectangle.
     * 
     * @return double representing the area of a rectangle.
     */
    public double getArea() {
        return (height * width);
    };
    
    /**
     * Returns the perimeter of a rectangle.
     * 
     * @return double representing the are of a rectangle.
     */
    public double getPerimeter() {
        return (height + width) * 2;
    };
    
    
}
