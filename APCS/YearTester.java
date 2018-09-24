import java.util.Scanner;
import java.io.InputStream;

public class YearTester
{
   public static void main(String[] args)
   {
      int year;
      Scanner scanner = new Scanner( System.in );
      
      System.out.println("What is the year you are testing");
      year = scanner.nextInt();
      LeapYear test = new LeapYear( year );
      
      if ( test.isLeapYear() == true )
      {
         System.out.println(year+" is a leap year");
      }
      else 
      {
         System.out.println(year+" is not a leap year");
      }
   }
}             