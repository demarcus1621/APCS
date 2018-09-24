import java.util.Scanner;
import java.io.InputStream;

public class TimeTest
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner( System.in );
      String time1;
      String time2;
      
      System.out.println("What is te first time");
      time1 = scanner.nextLine();
      System.out.println("What is the second time");
      time2 = scanner.nextLine();
      
      MilTime timer = new MilTime(time1 , time2);
      timer.CalcTime();
      System.out.println("The hours are "+timer.getHours()+" the minutes are "+timer.getMinutes());
   }
}      