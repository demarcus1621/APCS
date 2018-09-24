import java.awt.Rectangle;
import java.lang.Math;

public class Square extends Rectangle
{
   private double sideLength;
   private double squareArea;
   private double squarePerimeter;
   private double squareDiagonal;
   
   public Square() // default constructor
   {
   sideLength = 0;
   squareArea = 0;
   squarePerimeter = 0;
   squareDiagonal = 0;
   }
   
   public Square( double sideLength ) // constructor that takes side length as a parameter
   {
   this.sideLength = sideLength;
   this.squareArea = sideLength * sideLength;
   this.squarePerimeter = 4 * sideLength;
   this.squareDiagonal = Math.sqrt((sideLength * sideLength) * 2);
   }
   
   public double areaCalc() // calculates area 
   {
   this.squareArea = this.sideLength * this.sideLength;
   return(this.squareArea);
   }
   
   public double perimeterCalc() // calculates perimeter
   {
   this.squarePerimeter = this.sideLength * 4;
   return(this.squarePerimeter);
   }
   
   public double diagonalCalc() // calculates the diagonal of the square
   {
   this.squareDiagonal = Math.sqrt(2) * this.sideLength;
   return(this.squareDiagonal);
   }
   
   public double getSideLength() // returns the side length of the square
   {
   return(this.sideLength);
   }
   
   public double getSquareArea() // returns the area of the square
   {
   return(this.squareArea);
   }
   
   public double getSquarePerimeter() // returns the perimeter of the square
   {
   return(this.squarePerimeter);
   }
   
   public double getSquareDiagonal() // returns the diagonal length of the square
   {
   return(this.squareDiagonal);
   }
   
   public void setSideLength(double intake) // claculates dimensions of square when side length is changed
   {
   this.sideLength = intake;
   this.squareArea = intake * intake;
   this.squarePerimeter = intake * 4;
   this.squareDiagonal = intake * Math.sqrt(2);
   }
   
   public void setSquareArea(double inner) // claculates dimensions of square when area is changed
   {
   this.sideLength = Math.sqrt(inner);
   this.squareArea = inner;
   this.squarePerimeter = 4 * Math.sqrt(inner);
   this.squareDiagonal = Math.sqrt(2) * Math.sqrt(inner);
   }
   
   public void setSquarePerimeter(double intro) // calculates dimensions of square when perimeter is changed
   {
   this.sideLength = intro / 4;
   this.squareArea = (intro / 4) * (intro / 4);
   this.squarePerimeter = intro;
   this.squareDiagonal = (intro / 4) * Math.sqrt(2);
   }
   
   public void setSquareDiagonal(double inn) // calculates dimensions of square when diagonal value is changed
   {
   this.sideLength = inn / Math.sqrt(2);
   this.squareArea = (inn / Math.sqrt(2)) * (inn / Math.sqrt(2));
   this.squarePerimeter = (inn / Math.sqrt(2)) * 4;
   this.squareDiagonal = inn;
   }
}   