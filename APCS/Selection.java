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
      array = new int[convert.length];
      for( int k = 0 ; k < convert.length ; k++ )
      {
         array[k] = Integer.parseInt( convert[k] );
      }   
      return array;
   }
   
   public int[] sort(int[] v)
   {
      for( int i = 0 ; i < v.length ; i++ )
      {
         for( int j = i + 1 ; j < v.length ; j++ )
         {
            if( v[j] < v[i] )
            {
               temp = v[i];
               v[i] = v[j];
               v[j] = temp;
            }
         }
      }
      return array;
   }
}               