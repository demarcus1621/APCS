public class BalloonTester
{
   public static void main(String[] args)
   {
      Balloon test = new Balloon();
      Balloon tester = new Balloon(1);
      
      test.addAir(100);
      tester.addAir(10);
      
      System.out.println(test.getVolume());
      System.out.println(tester.getVolume());
      
      System.out.println(test.getSurfaceArea());
      System.out.println(tester.getSurfaceArea());
      
      System.out.println(test.getRadius());
      System.out.println(tester.getRadius());
   }
}      