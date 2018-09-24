import java.util.Scanner;
import java.io.InputStream;

public class Selection
{
   Scanner scanner = new Scanner( System.in );
   int array[];
   String convert[];
   int temp;
   String length;
   
   public Selection()
   {
   }
   
   public int[] arrayMaker()
   {
      System.out.println("Input the elements of the array separated by spaces");
      length = scanner.nextLine();
      convert = length.split(" ");
      for( int k = 0 ; k < convert.length ; k++ )
      {
         array[k] = Integer.parseInt( convert[k] );
      }   
      return array;
   }
   
   public int[] sort()
   {
      for( int i = 0 ; i < array.length ; i++ )
      {
         for( int j = i + 1 ; j < array.length ; j++ )
         {
            if( array[j] < array[i] )
            {
               temp = array[i];
               array[i] = array[j];
               array[j] = temp;
            }
         }
      }
      return array;
   }
}               