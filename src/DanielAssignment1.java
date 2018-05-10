/**
 * 
 * @author Daniel de Sao Jose
 * @version 1
 * 
 */
public class DanielAssignment1 {
    public static void main(String[] args) {
        
        // Create instance of Rectangle
        DanielAssignment1Rectangle r1 = new DanielAssignment1Rectangle(4, 40);
        DanielAssignment1Rectangle r2 = new DanielAssignment1Rectangle(3.5, 
                35.9);
        
        System.out.printf("\n"
                + "Rectangle 1\n"
                + "===========\n"
                + "Width: %f\n"
                + "Height: %f\n"
                + "Area: %f\n"
                + "Perimeter: %f\n", r1.width, r1.height, r1.getArea(), 
                r1.getPerimeter());
        
        System.out.printf("\n"
                + "Rectangle 2\n"
                + "===========\n"
                + "Width: %f\n"
                + "Height: %f\n"
                + "Area: %f\n"
                + "Perimeter: %f\n", r2.width, r2.height, r2.getArea(), 
                r2.getPerimeter());
        
        System.out.println();
        
    };
}
