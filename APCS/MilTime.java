public class MilTime
{
   String time1;
   String time2;
   int times1;
   int times2;
   String hour1;
   String hour2;
   int hr1;
   int hr2;
   String minute1;
   String minute2;
   int min1;
   int min2;
   int hdif;
   int mdif;
   String hours;
   String minutes;
   
   
   public MilTime( String var1 , String var2 ) // constructor
   { 
      this.time1 = var1;
      this.time2 = var2;
      
      this.hour1 = this.time1.substring(0,2);
      this.hour2 = this.time2.substring(0,2);
      
      this.minute1 = this.time1.substring(2,4);
      this.minute2 = this.time2.substring(2,4);
   }
   
   public void CalcTime() // calculates time difference
   {  
      hr1 = Integer.parseInt( this.hour1 );
      hr2 = Integer.parseInt( this.hour2 );
      // changes from string to integer
      min1 = Integer.parseInt( this.minute1 );
      min2 = Integer.parseInt( this.minute2 );
      
      times1 = Integer.parseInt( this.time1 );
      times2 = Integer.parseInt( this.time2 );
      // determines the difference
      if ( this.times2 > this.times1 )
      {
         this.hdif = this.hr2 - this.hr1;
         if ( this.min2 > this.min1 )
         {
            this.hdif = this.hr2 - this.hr1;
            this.mdif = this.min2 - this.min1;
         }
         else
         {
            this.mdif = ( 60 - this.min1 ) + this.min2;
            this.hdif = this.hdif - 1;
         }   
      }
      else
      {
         this.hdif = ( 24 - this.hr1 ) + this.hr2;
         
         if ( this.min1 > this.min2 )
         {
            this.mdif = ( 60 - this.min1 ) + this.min2;
         }
         else
         {
            this.mdif = this.min2 - this.min1;
         }
      }
      
      this.hours = Integer.toString(this.hdif);
      this.minutes = Integer.toString(this.mdif);
   }
   // returns the time differences
   public String getHours()
   {
      return (this.hours);
   }
   
   public String getMinutes()
   {
      return (this.minutes);
   }      
}                   