import java.awt.Rectangle;
import java.awt.Polygon;
import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.lang.String;
import javax.swing.JFrame;
import javax.swing.JComponent;

public class House extends JComponent
{
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      g2.setColor(new Color(0,191,255));
      Rectangle sky = new Rectangle(0,0,2000,1000);
      g2.fill(sky);
      g2.draw(sky);
      
      g2.setColor(new Color(156,102,31));
      Rectangle body = new Rectangle(100,100,1000,500);
      g2.fill(body);
      g2.draw(body);
      g2.setColor(new Color(128,128,105));
      Polygon roof = new Polygon();
      roof.addPoint(100,100);
      roof.addPoint(550,0);
      roof.addPoint(1100,100);
      g2.fill(roof);
      g2.draw(roof);
      Rectangle space = new Rectangle(500,400,100,200);
      g2.setColor(new Color(255,255,255));
      g2.fill(space);
      g2.draw(space);
      Ellipse2D.Double knob = new Ellipse2D.Double(550,500,10,10);
      g2.setColor(new Color(255,255,0));
      g2.fill(knob);
      g2.draw(knob);
      Rectangle wind = new Rectangle(300,400,100,100);
      g2.setColor(new Color(0,0,0));
      g2.setStroke(new BasicStroke(6));
      g2.draw(wind);
      g2.setColor(new Color(0,255,0));
      g2.fill(wind);
   }
}      