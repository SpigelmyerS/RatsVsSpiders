
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
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

/* 
   Refactored the variables names in "Rat" Class.
   Contributed by: Richa Patel
*/

public class Rat extends Rectangle{  
    private ImageIcon ratImage;
    private final int ratImageSize;
    private Image ResizedRatImage;
    
    public Rat(int width, int height){
      ratImage = new ImageIcon("src/images/rat.gif");
      ResizedRatImage = ratImage.getImage().getScaledInstance(80, 80,Image.SCALE_DEFAULT);
      ratImageSize =ratImage.getIconWidth();
      setBounds(400,400, ratImageSize, ratImageSize);    
    }
    
    public void DrawRat(Graphics g) {
        g.drawImage(ResizedRatImage, this.x, this.y, null);
    }
    
    public final void Invert(){
        ratImage = new ImageIcon("src/images/rat_flipped.gif"); ResizedRatImage = ratImage.getImage();
    }
    
     public final void RightOrient(){
        ratImage = new ImageIcon("src/images/rat.gif"); ResizedRatImage = ratImage.getImage();
    }
}
