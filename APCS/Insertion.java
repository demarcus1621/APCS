import java.util.Scanner;
import java.io.InputStream;

public class Insertion
{
   String convert[];
   int array[];
   Scanner scanner = new Scanner( System.in );
   int temp;
   String length;
   
   public Insertion()
   {
   }
   
   public int[] arrayMaker()
   {
      System.out.println("Input the elements of the array separated by spaces");
      length = scanner.nextLine();
      convert = length.split(" ");
      array = new int[convert.length];
      for( int i = 0 ; i < convert.length ; i++ )
      {
         array[i] = Integer.parseInt( convert[i] );
      }
      return array;
   }
   
   public int[] sort( int[] v )
   {
      for( int i = 1 ; i < v.length ; i++ )
      {
         int j = i;
         while (  j > 0 && array[j-1] > array[j] )
         {
               temp = array[j - 1];
               array[j - 1] = array[j];
               array[j] = temp;
               j--;
         }
      }
      return array;
   }
}               