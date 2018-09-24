import java.util.Scanner;
import java.io.InputStream;
import java.util.Arrays;

public class LinSearch
{
   private String array[];
   private String length;
   private int index = -1;
   private String value;
   Scanner scanner = new Scanner( System.in );
   
   public LinSearch()
   {
   }
   
   public void arrayMaker()
   {
      System.out.println("Input your elements separated by spaces");
      length = scanner.nextLine();
      array = length.split(" ");
   }
   
   public int search()
   {
      System.out.println("What is the string you are searching for");
      value = scanner.nextLine();
      for( int i = 0 ; i < array.length ; i++ )
      {
         if( array[i].equals(value) )
         {
            index = i;
            break;
         }
      }
      return(index);
   }
}             