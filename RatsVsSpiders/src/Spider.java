
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javafx.scene.paint.ImagePattern;
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
    private Object spiders;
    /*private final Dimension size; */
    private Color spiderColor;
    private int SpiderLocx;
    private int SpiderLocy;
    private final ImageIcon image;
    private final int imageSize;
    private Image ResizedImage;
    
    public Spider(int width, int height){
       /* image = new Image("Test");*/
      /* spiderColor= Color.RED;
        size = new Dimension(10, 10);
       */
       image = new ImageIcon("src/images/spiders.png");
       ResizedImage = image.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
       SpiderMovement();
       imageSize =image.getIconWidth();
       setBounds(SpiderLocx, SpiderLocy, imageSize, imageSize);
       
    }
     public void Draw(Graphics g) {
     
     g.drawImage(ResizedImage, this.x, this.y, null);
       
       
   
       
     }       
     public void SpiderMovement(){
         Random r = new Random();
         int m = 0;
        SpiderLocx =r.nextInt(750);
        SpiderLocy = r.nextInt(550);
        
        
        /*  double Rn = Math.random();
          int i = 1;
        int random = (int)(Rn*1000);
        
        */
     }
}
