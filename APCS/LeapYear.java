public class LeapYear
{
   private int year;
   
   public LeapYear( int years )
   {
      year = years;
   }   
   
   public boolean isLeapYear()
   {
     if ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0 )
     {
      return(true);
     }
     
     else
     {
      return(false);
     }
   }
}        