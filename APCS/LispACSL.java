import java.io.InputStream;
import java.util.Scanner;

public class LispACSL
{
   Scanner scanner;
   private String reverse;
   public LispACSL()
   {
      Scanner scanner = new Scanner( System.in );
   }
   
   public void program()
   {
      for( int i = 0 ; i < 5 ; i++ )
      {
         if ( i == 0 ) 
         {
            String input = scanner.nextLine();
            for( int j = 0 ; j + 2 < input.length() - 1 ; j++ )
            {
               reverse += input.charAt( input.length() - ( j + 2 )  );
            }
            System.out.println( "'(" + reverse + ")" );
         }
      }
   }
}               