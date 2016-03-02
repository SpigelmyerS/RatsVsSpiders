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
    public int imageSize;
    public Image ResizedImage;
 
    public Obstacles ball;

    public Obstacles(int width, int height){
       image = new ImageIcon("src/images/SoccerBall.png");
       ResizedImage = image.getImage().getScaledInstance(80, 80,Image.SCALE_DEFAULT);
     
       imageSize =image.getIconWidth();
       setBounds(65, 75, imageSize, imageSize);
       
           
       
    }
    
     public void Draw(Graphics g) {
   
    
        g.drawImage(ResizedImage, this.x, this.y, null);

     } 
}

