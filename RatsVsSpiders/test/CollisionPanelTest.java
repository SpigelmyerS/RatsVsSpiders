/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
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
     * Test of actionPerformed method, of class CollisionPanel.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        CollisionPanel instance = new CollisionPanelImpl();
        instance.actionPerformed(e);
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

    /**
     * Test of down method, of class CollisionPanel.
     */
    @Test
    public void testDown() {
        System.out.println("down");
        CollisionPanel instance = new CollisionPanelImpl();
        instance.down();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of left method, of class CollisionPanel.
     */
    @Test
    public void testLeft() {
        System.out.println("left");
        CollisionPanel instance = new CollisionPanelImpl();
        instance.left();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of right method, of class CollisionPanel.
     */
    @Test
    public void testRight() {
        System.out.println("right");
        CollisionPanel instance = new CollisionPanelImpl();
        instance.right();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of keyPressed method, of class CollisionPanel.
     */
    @Test
    public void testKeyPressed() {
        System.out.println("keyPressed");
        
        KeyEvent event = null ;
        CollisionPanel instance = new CollisionPanelImpl();
        instance.keyPressed(event);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of keyTyped method, of class CollisionPanel.
     */
    @Test
    public void testKeyTyped() {
        System.out.println("keyTyped");
        KeyEvent e = null;
        CollisionPanel instance = new CollisionPanelImpl();
        instance.keyTyped(e);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of keyReleased method, of class CollisionPanel.
     */
    @Test
    public void testKeyReleased() {
        System.out.println("keyReleased");
        KeyEvent e = null;
        CollisionPanel instance = new CollisionPanelImpl();
        instance.keyReleased(e);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of SpiderMovement method, of class CollisionPanel.
     */
    @Test
    public void testSpiderMovement() {
        System.out.println("SpiderMovement");
        CollisionPanel instance = new CollisionPanelImpl();
        instance.SpiderMovement();
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
