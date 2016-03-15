
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

/* 
   Refactored the "Spider" Class.
   Contributed by: Richa Patel
*/

public class Spider extends Rectangle {
    public int SpiderLocx;
    public int SpiderLocy;
    public int SpiderSpeed;
    public ImageIcon spiderImage;
    public  int spiderImageSize;
    public Image ResizedSpiderImage;

    public Spider(int width, int height){
       spiderImage = new ImageIcon("src/images/spiders.gif");
       ResizedSpiderImage = spiderImage.getImage().getScaledInstance(width, height,Image.SCALE_DEFAULT);
       SpiderLocation(); 
       spiderImageSize = spiderImage.getIconWidth();
       setBounds(SpiderLocx, SpiderLocy, width, height);   
    }
    
    public void Draw(Graphics g) {
        g.drawImage(ResizedSpiderImage, this.x, this.y, null);
  
    }
    
    public void SpiderLocation(){
        Random r = new Random();
        int m = 0;
        SpiderLocx = r.nextInt(750);
        SpiderLocy = r.nextInt(550); 
    }
}

