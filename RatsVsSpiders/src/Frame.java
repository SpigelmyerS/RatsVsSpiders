
import javax.swing.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suzanne
 */
public class Frame extends JFrame{
    
    Frame(){
        
    
     super ("Test");
        /*SpiderTest panel = new SpiderTest();
        getContentPane().add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize (500, 550);
        setVisible(true);   
     */
     
        JFrame f = new JFrame();
        CollisionPanel r = new CollisionPanel() {};
        f.add(r);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1200,700);
        f.setResizable(false);
          
        
    }
}
