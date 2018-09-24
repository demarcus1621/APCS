public class SquareTester
{
   public static void main(String args[])
   {
      Square test = new Square();
      Square tester = new Square(2);
      
      System.out.println(test.areaCalc());
      System.out.println(tester.areaCalc());
      
      System.out.println(test.perimeterCalc());
      System.out.println(tester.perimeterCalc());
      
      System.out.println(test.diagonalCalc());
      System.out.println(tester.diagonalCalc());
      
      test.setSideLength(10);
      tester.setSideLength(10);
      
      System.out.println(test.getSideLength());
      System.out.println(tester.getSideLength());
      
      test.setSquareArea(100);
      tester.setSquareArea(100);
      
      System.out.println(test.getSquareArea());
      System.out.println(test.getSquareArea());
      
      test.setSquarePerimeter(40);
      tester.setSquarePerimeter(40);
      
      System.out.println(test.getSquarePerimeter());
      System.out.println(tester.getSquarePerimeter());
      
      test.setSquareDiagonal(100);
      tester.setSquareDiagonal(100);
      
      System.out.println(test.getSquareDiagonal());
      System.out.println(tester.getSquareDiagonal());
   }
}      