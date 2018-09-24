import java.lang.Math;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JFrame;
import javax.swing.JComponent;

public class RandomShape extends JComponent
{
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      for( int i = 0 ; i < 10 ; i++ )
      {
         //g2.setColor(new Color((int)(Math.random()*1000 % 255),(int)( Math.random() * 1000 % 255),(int)(Math.random() * 1000 % 255)));
         g2.draw(this.random());
      }   
   }
   
   public Shape random()
   {
      if( (int) Math.random() * 1000 % 3 == 0 )
      {
         //g2.setColor(new Color(random.nextInt() % 255, random.nextInt() % 255, random.nextInt() % 255));
         Rectangle bx = new Rectangle((int)(Math.random() * 100), (int)(Math.random() * 100),(int)(Math.random() * 10),(int)(Math.random() * 10));
         //g2.fill(bx);
         return bx;
      }
      else if( (int) Math.random() * 1000 % 3 == 1 )
      {
         //g2.setColor(new Color(random.nextInt() % 255, random.nextInt() % 255, random.nextInt() % 255));
         Line2D.Double line = new Line2D.Double((double)(Math.random() * 100),(double)(Math.random() * 100),(int)( Math.random() * 100),(int)( Math.random() * 100));
         //g2.fill(line);
         return line;
      }
      else
      {
         //g2.setColor(new Color(random.nextInt() % 255, random.nextInt() % 255, random.nextInt() % 255));
         Ellipse2D.Double ell = new Ellipse2D.Double((double)(Math.random() * 100),(double)( Math.random() * 10), (double)(Math.random() * 10),(double)( Math.random() * 10));
         //g2.fill(ell);
         return ell;
      }
   }
}               