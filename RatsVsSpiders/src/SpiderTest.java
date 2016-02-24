
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suzanne
 */
public class SpiderTest extends JPanel implements ActionListener {
 public Spider sp1;     
    public JButton button;
    
    SpiderTest(){
        sp1= new Spider(5, 5);
       
       sp1.add(new Spider(5, 5));
       button= new JButton("helo");
       
    }
    @Override
    public void paintComponent(Graphics g){
        sp1.Draw(g);
    }
    public void actionPerformed(ActionEvent e){
 
}
}
