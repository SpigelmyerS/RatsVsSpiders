/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Graphics;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Richa
 */
public class RatTest {
    
    public RatTest() {
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
     * Test of DrawRat method, of class Rat.
     */
    @Test
    public void testDrawRat() {
        System.out.println("DrawRat");
        Graphics g = null;
        Rat instance = null;
        instance.DrawRat(g);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Invert method, of class Rat.
     */
    @Test
    public void testInvert() {
        System.out.println("Invert");
        Rat instance = null;
        instance.Invert();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of RightOrient method, of class Rat.
     */
    @Test
    public void testRightOrient() {
        System.out.println("RightOrient");
        Rat instance = null;
        instance.RightOrient();
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
