import java.util.Arrays;

public class InsTest
{
   public static void main(String[] args)
   {
      Insertion test = new Insertion();
      System.out.println(Arrays.toString(test.sort(test.arrayMaker())));
   }
}