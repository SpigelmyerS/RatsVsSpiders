import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.Timer;
import java.awt.event.KeyEvent;
import java.util.ArrayList;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Richa
 */
public abstract class RatTest extends JPanel implements ActionListener, KeyListener{
    Timer t = new Timer(5,this);
    double x=0, y=0, velx=0, vely;
     public ArrayList<Spider> spiders;     
     
   
    
  
  
    public RatTest(){
        
        spiders = new ArrayList();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false); 
       
        
       
       
      
    }
   
       
       
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.fill(new Ellipse2D.Double(x, y, 40, 40));
        
       /* for (int i = 1; i< spiders.size(); i++)
        {*/
            
        //}
       
         if (spiders.size()<3)
        {
            spiders.add(new Spider(10,10));
        }
         for(int i=0;i<spiders.size();i++)
        spiders.get(i).Draw(g);
   
        
        
    }
    
    public void actionPerformed(ActionEvent e){
        repaint();
        x += velx;
        y += vely;
       
        
    }
    
    public void up(){
        vely = -1.5;
        velx = 0;
    }
    
    public void down(){
        vely = 1.5;
        velx = 0;
    }
        
    public void left(){
        velx = -1.5;
        vely = 0;
    }
    
    public void right(){
        velx = 1.5;
        vely = 0;
    }
    
    public void keyPressed(KeyEvent event){
        t.start();
        int code = event.getKeyCode();
        
        if (code == KeyEvent.VK_UP){
            up();
        }
        if (code == KeyEvent.VK_DOWN){
            down();
        }
        if (code == KeyEvent.VK_RIGHT){
            right();
        }
        if (code == KeyEvent.VK_LEFT){
            left();
        }
    }
    
    public void keyTyped(KeyEvent e){}
    public void keyReleased(KeyEvent e){
        repaint();
        t.stop();}
}