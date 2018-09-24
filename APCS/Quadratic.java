import java.util.Scanner;
import java.io.InputStream;

public class Quadratic
{
 public static void main(String[] args)
 {
   Scanner scanner = new Scanner( System.in );
   
   double var1;
   double var2;
   double var3;
   
   System.out.print("Input your first coefficient (a).");
   var1 = scanner.nextDouble();
   System.out.print("Input your second coefficient (b).");
   var2 = scanner.nextDouble();
   System.out.print("Input your third coefficient (c).");
   var3 = scanner.nextDouble();
   
   QuadEq equation = new QuadEq( var1, var2, var3);
   System.out.println("The first solution is " + equation.getSolution1());
   System.out.println("The second solution is " + equation.getSolution2());
   
 }
}      