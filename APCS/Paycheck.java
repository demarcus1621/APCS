public class Paycheck
{
   private double overtime;
   private double hourly;
   private double hours;
   private double payment;
   
   public Paycheck( double hourer , double hourlier ) 
   {
      hourly = hourlier;
      hours = hourer;
   }
   
   public double paycheck()
   {
      if ( hours <= 40 )
      {
          payment = hours * hourly;
          return(payment);
      }
      else 
      {    
          overtime = hours - 40;
          payment = ( overtime * ( 1.5 * hourly ) ) + ( hourly * 40 );
          return(payment);
      }
   }
}   