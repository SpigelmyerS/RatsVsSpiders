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
 * @author capta
 */
public class CollisionPanelTest {
    
    public CollisionPanelTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
    @Test
    public void testSizeChange() {
        System.out.println("Check counter with size increase");
        CollisionPanel instance = new CollisionPanelImpl();    
        for (int i=0; i<6; i++){       
            instance.counter = i;
        }
        int expSize = 85;       
        int size = instance.counter*5+60;
        assertEquals(expSize, size);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of up method, of class CollisionPanel.
     */
    @Test
    public void testUpVelY() {
        System.out.println("up");
        double expResult = -1.5;
        CollisionPanel instance = new CollisionPanelImpl();
        instance.up();
        assertEquals(expResult, instance.vely, 2);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testUpVelX() {
        System.out.println("up");
        double expResult = 0;
        CollisionPanel instance = new CollisionPanelImpl();
        instance.up();
        assertEquals(expResult, instance.velx, 2);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of down method, of class CollisionPanel.
     */
    @Test
    public void testDownVelY() {
        System.out.println("down");
        double expResult = 2;
        CollisionPanel instance = new CollisionPanelImpl();
        instance.down();
        assertEquals(expResult, instance.vely, 2);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testDownVelX() {
        System.out.println("down");
        double expResult = 0;
        CollisionPanel instance = new CollisionPanelImpl();
        instance.down();
        assertEquals(expResult, instance.velx, 2);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of left method, of class CollisionPanel.
     */
    @Test
    public void testLeftVelY() {
        System.out.println("left");
        double expResult = 0;
        CollisionPanel instance = new CollisionPanelImpl();
        instance.left();
        assertEquals(expResult, instance.vely, 2);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testLeftVelX() {
        System.out.println("left");
        double expResult = -1.5;
        CollisionPanel instance = new CollisionPanelImpl();
        instance.left();
        assertEquals(expResult, instance.velx, 2);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of right method, of class CollisionPanel.
     */
    @Test
    public void testRightVelY() {
        System.out.println("right");
        double expResult = 0;
        CollisionPanel instance = new CollisionPanelImpl();
        instance.right();
        assertEquals(expResult, instance.vely, 2);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testRightVelX() {
        System.out.println("right");
        double expResult = 2;
        CollisionPanel instance = new CollisionPanelImpl();
        instance.right();
        assertEquals(expResult, instance.velx, 2);
        // TODO review the generated test code and remove the default call to fail.
    }

    public class CollisionPanelImpl extends CollisionPanel {
    }

    /**
     * Test of paintComponent method, of class CollisionPanel.
     */
    @Test
    public void testPaintComponent() {
        System.out.println("paintComponent");
        Graphics g = null;
        CollisionPanel instance = new CollisionPanelImpl();
        instance.paintComponent(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
