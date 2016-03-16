import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.*;
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
 * @author lap5486
 */

public class CollisionPanel extends JPanel implements ActionListener, KeyListener{   
    Timer t = new Timer(5,this);
    double x=0, y=0, velx=0, vely;
    public ArrayList<Spider> spiders;    
    private JTextArea score;
    private JTextArea Gameset;
    int counter = 0;
    int movementCounter;
    public Rat player;
    public Obstacles ball;
    public Obstacles yoyo;
    public Obstacles pencil;
    public Obstacles chair;
    public Obstacles spiderweb;
    public Obstacles books;
    
    public CollisionPanel(){
        BorderLayout b1= new BorderLayout();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false); 
       
        spiders = new ArrayList();
        player = new Rat(70, 70);
        score = new JTextArea("Hit arrow keys to start and try to hit the spiders! But be careful, the large ones will eat you!");
        Gameset = new JTextArea("");
        add(score).setLocation(0,0);
        ball = new Obstacles(50, 50);
        yoyo = new Obstacles(50, 50);
        pencil = new Obstacles(50, 50);
        chair = new Obstacles(50, 50);
        spiderweb = new Obstacles(50, 50);
        books = new Obstacles(50, 50);
    }
   
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        ImageIcon floor = new ImageIcon("src/images/Floor.png");
        int x = 0, y = 0;
        floor.paintIcon(this, g, x, y);
        
        ball.Draw(g);
        yoyo.Draw(g);
        pencil.Draw(g);
        chair.Draw(g);
        spiderweb.Draw(g);
        books.Draw(g);
        
        player.DrawRat(g);
     
        if (spiders.size()<3){
            spiders.add(new Spider(60,60));
        }
       
        for(int i=0;i<spiders.size();i++){
            spiders.get(i).Draw(g); 
            
        if (player.intersects(spiders.get(i))){
            if (player.width<spiders.get(i).width){
                if (player.height<spiders.get(i).height){
            Gameset.setText("Game Over");
                }
            }
            else {
                spiders.remove(i);
                counter++; 
            if (counter%2 == 0){
               player.width = 80+counter;
               player.height = 80+counter;
               player.DrawRat(g);
            }
           
            score.setText("Score:" + counter*100); 
            }}
        }
    }
   

    //Replaced magic number with symbolic constant
    //Refactored by Matt Ford
    public void actionPerformed(ActionEvent e){
        final int rightBound = 1120;
        final int leftBound = 0;
        final int lowerBound = 0;
        final int upperBound = 600;
        repaint();
        revalidate();
        player.x += velx;
        player.y += vely;
        if (player.x > rightBound){
            player.x = rightBound;
            
        }
        if (player.x < leftBound){
            player.x = leftBound;
        }
        if (player.y > upperBound){
            player.y = upperBound;
        }
        if (player.y < lowerBound){
            player.y = lowerBound;
        }
    }
    
    public void up(){
        vely = -1.5;
        velx = 0;
    }
    
    public void down(){
        vely = 2;
        velx = 0;
    }
        
    public void left(){
        velx = -1.5;
        vely = 0;
        
    }
    
    public void right(){
        velx = 2;
        vely = 0;    
    }
    // Refactored using "Extract Method"
    //Changed the function into a defined variable
    //Refactored by Levi Potutschnig
    int spiderSize = 60+movementCounter/6;
    public void keyPressed(KeyEvent event){
        t.start();
        SpiderMovement();
        int code = event.getKeyCode();
        
        if (code == KeyEvent.VK_UP){
            up();
            movementCounter++;
            if ((movementCounter%33)==0){
                spiders.add(new Spider(spiderSize,spiderSize));
            }
        }
        
        if (code == KeyEvent.VK_DOWN){
            down();
            movementCounter++;
            if ((movementCounter%33
                    )==0){
                spiders.add(new Spider(spiderSize,spiderSize));
            }
        }
        
        if (code == KeyEvent.VK_RIGHT){
            player.RightOrient();
            right();
            movementCounter++;
            if ((movementCounter%33)==0){
                spiders.add(new Spider(spiderSize,spiderSize));
            }
        }
        
        if (code == KeyEvent.VK_LEFT){
            player.Invert();
            left();
            movementCounter++;
            if ((movementCounter%33)==0){
                spiders.add(new Spider(spiderSize,spiderSize));
            }
        }
    }
    
    public void keyTyped(KeyEvent e){}
    
    public void keyReleased(KeyEvent e){
        repaint();
        t.stop();
    }
    
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
        
        //placed down here to avoid multiple window issue
        if(Gameset.getText().equals("Game Over")){
            GameOverPanel gmv = new GameOverPanel();
            gmv.FinalScore.setText(score.getText());
        }     
    }
} 
