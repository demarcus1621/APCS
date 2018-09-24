import java.util.ArrayList;
import java.util.Scanner;
import java.io.InputStream;

public class BinaryTest
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner( System.in );
      BinarySearch binary = new BinarySearch();
      ArrayList <Integer> list = binary.listMaker();
      System.out.println("What is the value that you are searching for");
      int value = scanner.nextInt();
      if(binary.search(list, value))
      {
         System.out.println("Your value was found within the list");
      }
      else
      {
         System.out.println("Your value was not found within the array");
      }     
   }
}      