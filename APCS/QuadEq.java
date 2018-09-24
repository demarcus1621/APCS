import java.lang.Math;

public class QuadEq
{
      private double a;
      private double b;
      private double c;
      private double sol1;
      private double sol2;
      
      public QuadEq( double v, double f, double g)// constructor
      {
          this.a = v;
          this.b = f;
          this.c = g;
      }
      
      public double getSolution1() //quadratic formua part 1
      {
         this.sol1 = ( -1*( this.b ) + Math.sqrt((Math.pow(this.b,2) - ( 4 * this.a * this.c ))) ) / ( 2 * this.a );
         return ( this.sol1 );
      }
      
      public double getSolution2() // quadratic formula part 2
      {
         this.sol2 = ( -1*( this.b ) - Math.sqrt((Math.pow(this.b,2) - ( 4 * this.a * this.c ))) ) / ( 2 * this.a );
         return (this.sol2);
      }
}              
