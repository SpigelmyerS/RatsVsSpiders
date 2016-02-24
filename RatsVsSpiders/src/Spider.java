
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javafx.scene.paint.ImagePattern;
import javax.swing.ImageIcon;

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
    private final Dimension size; 
    private Color spiderColor;
  
    private final ImageIcon image;
    private final int imageSize;
    
    public Spider(int width, int height){
       /* image = new Image("Test");*/
       spiderColor= Color.RED;
        size = new Dimension(10, 10);
       
       image = new ImageIcon("src/images/spiders.png");
       imageSize =image.getIconWidth();
       setBounds(0, 0, imageSize, imageSize);
    }
     public void Draw(Graphics g) {
     g.drawImage(image.getImage(), this.x, this.y, null);
        g.setColor(spiderColor);
        g.fillRect(this.x, this.y, this.x, this.y);
        
     }       
}
