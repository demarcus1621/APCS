import java.util.Scanner;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MagicSquare
{
   private int size;
   private int row = 0;
   private int column = 0;
   private int compare = 0;
   private int left = 0;
   private int right = 0;
   private boolean check = true;
   ArrayList<Integer> square = new ArrayList<Integer>();
   Scanner scanner = new Scanner( System.in );
   
   public MagicSquare( int length )
   {
      size = length;
      ArrayList<Integer> square = new ArrayList<Integer>();
   }
   
   public void adder()
   {
      for( int i = 0 ; i < ( size * size  ) ; i++ )
      {
         System.out.println("Input your number");
         square.add( scanner.nextInt() );
      }
                                                         // method loops to take in input for elements then sets the sum of first row as the comparison number
      for( int m = 0 ; m < size ; m++ )
      {
         compare += square.get(m);
      }
      
      System.out.println(square);
      System.out.println(compare);   
   }
   
   public boolean comp()  // checks for elements being within proper bounds
   {
      for ( int j = 0 ; j < ( size * size ) ; j++ )
      {
         for ( int k = 0 ; k < ( size * size ) ; k++)
         {
            if ( j != k && square.get(j) == square.get(k) || square.get(k) > ( size * size ) )
            {
               check = false;
               break;
            }
         }
      }
      return check;
   }
   
   public boolean sum()  // single method checks all sums 
   {
      for ( int g = 0 ; g < size ; g++ )
      {
         row = 0;
         for ( int h = 0 ; h < size ; h++ )
         {
            row += square.get(h + ( g * size ) );
         }
         if ( row != compare )
         {
            check = false;
            return false;
         }      
      } 
      
      for ( int g = 0 ; g < size ; g++ )
      {
         column = 0;
         for (int h = 0 ; h < size ; h++ )
         {
            column += square.get(  g + ( h * size ) );  
         }
         if ( column != compare )
         {
            check = false;
            return false;
         }   
      } 
      
      for ( int g = 0 ; g < size ; g++ )
      {
         left += square.get( g + ( g * size ) );
      }
      
      if ( left != compare )
      {
         check = false;
      }
      
      for ( int h = 1 ; h <= size ; h++ )
      {
         right += square.get( h * ( size - 1 ) );
      } 
      
      if ( right != compare )
      {
         check = false;
      }     
      
      return check;      
   }
}            