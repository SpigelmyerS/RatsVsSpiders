import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
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
public class Obstacles extends Rectangle {
  
    public int BallLocx;
    public int BallLocy;
    public ImageIcon image;
    public  int imageSize;
    public Image ResizedImage;

    public Obstacles(int width, int height){
       /* image = new Image("Test");*/
      /* spiderColor= Color.RED;
        size = new Dimension(10, 10);
       */
       image = new ImageIcon("src/images/SoccerBall.png");
       ResizedImage = image.getImage().getScaledInstance(width, height,Image.SCALE_DEFAULT);
       ObstacleLocation();
     
       imageSize =image.getIconWidth();
       setBounds(BallLocx, BallLocy, width, height);
       
           
       
    }
    
     public void Draw(Graphics g) {
   
    
   g.drawImage(ResizedImage, this.x, this.y, null);
       
       
   
      
     }       
     public void ObstacleLocation(){
         Random r = new Random();
         int m = 0;
        BallLocx =r.nextInt(750);
        BallLocy = r.nextInt(550);
              
        
     }
    
        
     }

