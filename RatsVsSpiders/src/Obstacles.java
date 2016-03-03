import java.awt.Color;
import java.awt.Component;
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
  
    Image ball;
    Image yoyo;
    Image pencil;
    Image chair;
    Image spiderweb;
    Image books;
    
    public Obstacles(int width, int height){
        ImageIcon tennisball = new ImageIcon("src/images/tennisball.png");
        ball = tennisball.getImage();
        
        ImageIcon YoYo = new ImageIcon("src/images/yoyo.png");
        yoyo = YoYo.getImage();

        ImageIcon yellowpencil = new ImageIcon("src/images/pencil.png");
        pencil = yellowpencil.getImage();
        
        ImageIcon brownchair = new ImageIcon("src/images/chair.png");
        chair = brownchair.getImage();
        
        ImageIcon web = new ImageIcon("src/images/spiderweb.png");
        spiderweb = web.getImage();
        
        ImageIcon stackofbooks = new ImageIcon("src/images/books.png");
        books = stackofbooks.getImage();
    }
    
    public void Draw(Graphics g) {
        g.drawImage(ball, 225, 500, null);
        g.drawImage(yoyo, 700, 300, null);
        g.drawImage(pencil, 900, 500, null);
        g.drawImage(chair, -10, -225, null);
        g.drawImage(spiderweb, 1075, -35, null);
        g.drawImage(books, 435, -14, null);
    } 
}

