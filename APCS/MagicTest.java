import java.util.Scanner;
import java.io.InputStream;

public class MagicTest
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner( System.in );
      System.out.println("What is the side length?");
      MagicSquare square = new MagicSquare( scanner.nextInt() );
      square.adder();
      
      if ( square.comp() )
      {
         if ( square.sum() )
         {
            System.out.println("This is a magic square");
         }
         else 
         {
            System.out.println("This is not a magic square");
         }
      }
      else
      {
         System.out.println("This does not pass the comparison test");
      }
   }
}                     