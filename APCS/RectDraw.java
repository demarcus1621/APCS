import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JComponent;

public class RectDraw extends JComponent
{
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D)g;
      Rectangle boxe = new Rectangle(10,10,5,10);
      g2.draw(boxe);
      boxe.translate(5,0);
      g2.draw(boxe);
      boxe.translate(0,10);
      g2.draw(boxe);
      boxe.translate(-5,0);
      g2.draw(boxe);
   }
}


      
 