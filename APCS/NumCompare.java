import java.lang.Math;

public class NumCompare
{
   private double abba;
   private double b;
   private double difference;
   private double check;
   
   public NumCompare( double as , double bs )
   {
      abba = as;
      b = bs;
   }
   
   public boolean difference()
   {
      if ( abba > b  && abba - b < 0.01 )
      {
         return(true);
      }
      else 
      {
         return(false);
      }
   }
   
   public boolean check()
   {
      abba = abba * 100;
      b = b * 100;
      if( Math.round(abba) == Math.round(b) )
      {
         return(true);
      }
      else 
      {
         return(false);
      }
   }
}            