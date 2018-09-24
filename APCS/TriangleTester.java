import java.io.InputStream;
import java.util.Scanner;

public class TriangleTester
{
   public static void main(String[] args)
   {
      double xval;
      double yval;
      
      Triangle google = new Triangle();
      Scanner scanner = new Scanner( System.in );
      System.out.print("Input the first X-coordinate");
      xval = scanner.nextDouble();
      System.out.print("Input the first Y-coordinate");
      yval = scanner.nextDouble();
      google.setPoint1( xval , yaval );
      System.out.print("Input the second X-coordinate");
      xval = scanner.nextDouble();
      System.out.print("Input the second Y-coordinate");
      yval = scanner.nextDouble();
      google.setPoint2( xval , yval );
      System.out.print("Input the third x-coordinate");
      xval =  scanner.nextLine();
      System.out.print("Input the third Y-coordinate");
      yval = scanner.nextDouble();
      google.setPoint3( xval , yval );
      
      // table time
      
      System.out.println("The area is "+ google.getArea());
      System.out.println("The perimeter is " + google.getPeri());
      System.out.println("The first angle is " + google.geta1());
      System.out.println("The second angle is " + google.geta2());
      System.out.println("The third angle is " + google.geta3());
      System.out.println("The first side length is " + google.gets1());
      System.out.println("the second side length is " + google.gets2());
      System.out.println("The third side length is " + google.gets3());
   }
}      
      
      