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
    Image image2;
 
    //public Obstacles ball;

    public Obstacles(int width, int height){
        ImageIcon soccerball = new ImageIcon("src/images/SmallSoccerBall.png");
        ball = soccerball.getImage();
    }
    
    public void Draw(Graphics g) {
   
        g.drawImage(ball, 225, 300, null);

    } 
}

