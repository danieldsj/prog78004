/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daniel
 */
public class DanielAssignment1RectangleTest {
    
    public DanielAssignment1RectangleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getArea method, of class DanielAssignment1Rectangle.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        DanielAssignment1Rectangle instance1 = new DanielAssignment1Rectangle();
        DanielAssignment1Rectangle instance2 = new DanielAssignment1Rectangle(3, 
                3);
        double expResult1 = 1.0;
        double expResult2 = 9.0;
        double result1 = instance1.getArea();
        double result2 = instance2.getArea();
        assertEquals(expResult1, result1, 0.0);
        assertEquals(expResult2, result2, 0.0);
    }

    /**
     * Test of getPerimeter method, of class DanielAssignment1Rectangle.
     */
    @Test
    public void testGetPerimeter() {
        System.out.println("getPerimeter");
        DanielAssignment1Rectangle instance1 = new DanielAssignment1Rectangle();
        DanielAssignment1Rectangle instance2 = new DanielAssignment1Rectangle(3, 
                3);
        double expResult1 = 4.0;
        double expResult2 = 12.0;
        double result1 = instance1.getPerimeter();
        double result2 = instance2.getPerimeter();
        assertEquals(expResult1, result1, 0.0);
        assertEquals(expResult2, result2, 0.0);
    }
    
}
