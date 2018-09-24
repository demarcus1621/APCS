import java.io.InputStream;
import java.util.Scanner;

public class FlipTest
{
   public static void main(String[] args)
   {
      String input;
      Scanner scanner = new Scanner( System.in );
      System.out.println("Input the number");
      input = scanner.nextLine();
      int x = input.length();
      int change = Integer.parseInt(input);
      
      NumberFlip test = new NumberFlip( change );
      System.out.println(test.NumFlip());
      
      while ( x > 1 )
      {
         System.out.println(test.NumFlip());
         x--;
      }   
   }
}