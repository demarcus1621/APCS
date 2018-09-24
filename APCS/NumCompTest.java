import java.util.Scanner;
import java.io.InputStream;

public class NumCompTest
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner( System.in );
      System.out.println("What is the first number");
      double first = scanner.nextDouble();
      System.out.println("What is the second number");
      double second = scanner.nextDouble();
      
      NumCompare test = new NumCompare( first , second );
      
      if (test.difference() == true )
      {
         System.out.println("The difference is less than 0.1");
      }
      else
      {
         System.out.println("The difference is not less than 0.1");
      }
      
      if ( test.check() == true )
      {
         System.out.println("The numbers are the same when rounded to two decimal places");
      }
      else 
      {
         System.out.println("The numbers are not the same when rounded to two decimal places");
      }
   }
}                  