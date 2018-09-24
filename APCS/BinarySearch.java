import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.InputStream;

public class BinarySearch
{
   Scanner scanner = new Scanner( System.in );
   ArrayList<Integer> list = new ArrayList<Integer>();
   private int size;
   
   public BinarySearch()
   {
   }
   
   
   public ArrayList<Integer> listMaker()
   {
      System.out.println("What is the size of your list");
      size = scanner.nextInt();
      for( int i = 0 ; i < size ; i++ )
      {
         list.add(scanner.nextInt());
      }
      
      return list;
   }
   
   public boolean search(List<Integer> n, int value)
   {   
      if( n.size() > 1 )
      {
         for( int i = 0 ; i < n.size() / 2 ; i++ )
         {
            if( n.get(i) == value )
            {
               return true;
            }
            else
            {
               return search( n.subList(n.size()/2,n.size()), value );
            }
         }          
      }
      else if( n.get(0) == value )
      {
         return true;
      } 
      else
      {
         return false;
      }
      return false;
   }
}               