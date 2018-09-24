import java.lang.Math;

public class Balloon
{
   private double radius;
   private double volume;
   private double surface;
   
   public Balloon()
   {
      this.radius = 0;
      this.volume = 0;
      this.surface = 0;
   }
   
   public Balloon( double radius )
   {
      this.radius = radius;
      this.volume = ( 4 * Math.pow(this.radius,3) * Math.PI ) / 3;
      this.surface =  4 * Math.PI * Math.pow(this.radius,2);
   }
   
   public void addAir( double amount )
   {
      this.volume = amount + this.volume;
      this.radius = Math.pow( (3 * Math.PI) / 4 , (1/3));
      this.surface = (this.radius * this.volume) / 3;
   }
   
   public double getVolume()
   {
      return(this.volume);
   }
   
   public double getSurfaceArea()
   {
      return(this.surface);
   }
   
   public double getRadius()
   {
      return(this.radius);
   }            
}            