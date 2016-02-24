
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

/**
 *
 * @author Suzanne
 */

public class Rat extends Rectangle{    
    // Block properties
    private Color ratColor;
    private int ratSize;
    
    public Rat(int panelWidth, int panelHeight) {
        // Block properties
        ratSize = 40;
        ratColor = Color.GRAY;
        this.setBounds(0, 0, ratSize, ratSize);
    }
    
    public void Draw(Graphics g) {
        // Draw
        g.setColor(ratColor);
        g.fillRect(this.x, this.y, this.width, this.height);
    }
}
