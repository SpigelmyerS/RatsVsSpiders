
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
 * @author Suzanne
 */
public class Spider extends Rectangle {
   
    /*private final Dimension size; */
    
    public int SpiderLocx;
    public int SpiderLocy;
    public int SpiderSpeed;
    public ImageIcon image;
    public  int imageSize;
    public Image ResizedImage;

    public Spider(int width, int height){
       /* image = new Image("Test");*/
      /* spiderColor= Color.RED;
        size = new Dimension(10, 10);
       */
       image = new ImageIcon("src/images/spiders.png");
       ResizedImage = image.getImage().getScaledInstance(width, height,Image.SCALE_DEFAULT);
       SpiderLocation();
     
       imageSize =image.getIconWidth();
       setBounds(SpiderLocx, SpiderLocy, width, height);
       
           
       
    }
    
     public void Draw(Graphics g) {
   
    
   g.drawImage(ResizedImage, this.x, this.y, null);
       
       
   
      
     }       
     public void SpiderLocation(){
         Random r = new Random();
         int m = 0;
        SpiderLocx =r.nextInt(750);
        SpiderLocy = r.nextInt(550);
              
        
     }
    
        
     }

