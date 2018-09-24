import java.util.Arrays;

public class SelTest
{
   public static void main(String[] args)
   {
      Selection test = new Selection();
      System.out.println(Arrays.toString(test.sort(test.arrayMaker())));
   }
}      