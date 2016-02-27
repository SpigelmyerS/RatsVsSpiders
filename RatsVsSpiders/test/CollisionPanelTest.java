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
        fail("The test case is a prototype.");
    }

    /**
     * Test of up method, of class CollisionPanel.
     */
    @Test
    public void testUp() {
        System.out.println("up");
        CollisionPanel instance = new CollisionPanelImpl();
        instance.up();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        fail("The test case is a prototype.");
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
        fail("The test case is a prototype.");
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
        fail("The test case is a prototype.");
    }

    /**
     * Test of keyPressed method, of class CollisionPanel.
     */
    @Test
    public void testKeyPressed() {
        System.out.println("keyPressed");
        KeyEvent event = null;
        CollisionPanel instance = new CollisionPanelImpl();
        instance.keyPressed(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        fail("The test case is a prototype.");
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
        fail("The test case is a prototype.");
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
        fail("The test case is a prototype.");
    }

    public class CollisionPanelImpl extends CollisionPanel {
    }
    
}
