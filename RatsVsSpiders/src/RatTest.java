import java.awt.BorderLayout;
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
import java.util.Random;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Richa
 */

//Testing GUIs, paintcomponent
public abstract class RatTest extends JPanel implements ActionListener, KeyListener{
    Timer t = new Timer(5,this);
    double x=0, y=0, velx=0, vely;
     public ArrayList<Spider> spiders;    
     private JTextArea score;
     int counter;
     
     
   public Rat player;
  
  
    public RatTest(){
        BorderLayout b1= new BorderLayout();
        spiders = new ArrayList();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false); 
       
        player = new Rat(20, 20);
        counter = 0; 
       score = new JTextArea("Hit arrow keys to start and try to hit the spiders!");
       add(score).setLocation(0,0);
       
      
    }
   
       
       
    public void paintComponent(Graphics g){
        super.paintComponent(g);
       /* Graphics2D g2 = (Graphics2D) g;
        g2.fill(new Ellipse2D.Double(x, y, 40, 40));*/
        player.DrawRat(g);
         if (spiders.size()<3)
        {
            spiders.add(new Spider(10,10));
        }
        
        for(int i=0;i<spiders.size();i++){
        spiders.get(i).Draw(g); 

        if (player.intersects(spiders.get(i))){
           spiders.remove(i);
           counter= counter+1;
           score.setText("Score:" + counter);
           
        }
       
        }
        
         
  
 
             
      
         
    }
    
    public void actionPerformed(ActionEvent e){
        repaint();
        player.x += velx;
        player.y += vely;
        
    
    
    
    
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
      SpiderMovement();
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
    
    public void SpiderMovement(){
        Random r = new Random();
         for(int i = 0; i<spiders.size();i++){
         
        spiders.get(i).x+=r.nextInt(10);
        repaint();
        }
         for(int i = 0; i<spiders.size();i++){
         
        spiders.get(i).x-=r.nextInt(10);
        repaint();
         }
        for(int i = 0; i<spiders.size();i++){
         
        spiders.get(i).y+=r.nextInt(10);
        repaint();
        }
        for(int i = 0; i<spiders.size();i++){
         
        spiders.get(i).y-=r.nextInt(10);
        repaint();
        }
}
}