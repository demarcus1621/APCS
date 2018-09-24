import java.awt.Rectangle;
public class AreaTester
{
   public static void main(String[] args)
   {
      Rectangle boxe = new Rectangle(10,10,5,2);
      System.out.println("Length: " + boxe.getWidth());
      System.out.println("Width: " + boxe.getHeight());
      System.out.println("X - coordinate: " + boxe.getX());
      System.out.println("Y - coordinate: " + boxe.getY());
      System.out.println("The expected area is 10");
      System.out.println("The area is: " + boxe.getWidth() * boxe.getHeight());
      System.out.println("The expected perimeter is 14"); 
      double x = 2 * boxe.getWidth() + 2 * boxe.getHeight();
      System.out.println("The perimeter is: " + x );
   }
}     
      
    
