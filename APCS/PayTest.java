import java.util.Scanner;
import java.io.InputStream;

public class PayTest
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner( System.in );
      double hours;
      double wage;
      
      System.out.println("How long did you work");
      hours = scanner.nextDouble();
      System.out.println("What is your hourly wage");
      wage = scanner.nextDouble();
      
      Paycheck test = new Paycheck( wage , hours );
      
      System.out.println("Your paycheck should be" + test.paycheck() );
   }
}      