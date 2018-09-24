import java.util.Scanner;
import java.io.InputStream;

public class LinTest
{
   public static void main(String[] args)
   {  
      LinSearch test = new LinSearch();
      test.arrayMaker();
      System.out.println("Your value was found at index "+test.search());
   }
}      