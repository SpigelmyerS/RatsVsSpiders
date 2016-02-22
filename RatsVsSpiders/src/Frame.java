
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

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
        MainMenuPanel panel = new MainMenuPanel();
        getContentPane().add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize (900, 750);
        setVisible(true);    
    }
}
