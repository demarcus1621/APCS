import java.awt.Rectangle;
import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.lang.String;
import javax.swing.JFrame;
import javax.swing.JComponent;


public class KenFace extends JComponent
{
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      g2.setColor(new Color(217,92,0));
      Ellipse2D.Double hood = new Ellipse2D.Double(300,50,500,500);
      g2.fill(hood);
      g2.draw(hood);
      g2.setColor(new Color(0,0,0));
      g2.setStroke(new BasicStroke(6));
      Ellipse2D.Double outline = new Ellipse2D.Double(375,150,350,350);
      g2.draw(outline);
      g2.setStroke(new BasicStroke(0));
      g2.setColor(new Color(92,47,18));
      Ellipse2D.Double face = new Ellipse2D.Double(387.5,153.5,325,275);
      g2.fill(face);
      g2.draw(face);
      Ellipse2D.Double skin = new Ellipse2D.Double(475,153,150,275);
      g2.setColor(new Color(253,198,167));
      g2.fill(skin);
      g2.draw(skin);
      Ellipse2D.Double eye1 = new Ellipse2D.Double(475,220,75,105);
      g2.setColor(new Color(255,255,255));
      g2.fill(eye1);
      g2.draw(eye1);
      Ellipse2D.Double eye2 = new Ellipse2D.Double(550,220,75,105);
      g2.fill(eye2);
      g2.draw(eye2);
      Rectangle pupil = new Rectangle(512,275,10,10);
      g2.setColor(new Color(0,0,0));
      g2.fill(pupil);
      g2.draw(pupil);
      Rectangle pupils = new Rectangle(587,275,10,10);
      g2.fill(pupils);
      g2.draw(pupils);
      g2.drawString(new String("Kenny McCormiick dies in all but one episode"),300,550);
   }
}       