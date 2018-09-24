import java.awt.Rectangle;

public class PalmsRotation
{
   public static void main(String[] args)
   {
      Rectangle hyuga = new Rectangle(10,10,5,10);
      System.out.println(hyuga);
      hyuga.translate(5,0);
      System.out.println(hyuga);
      hyuga.translate(0,10);
      System.out.println(hyuga);
      hyuga.translate(-5,0);
      System.out.println(hyuga);
   }
}      

