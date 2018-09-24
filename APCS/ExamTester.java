import java.io.InputStream;
import java.util.Scanner;

public class ExamTester
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner( System.in );
      String intake;
      
      intake = scanner.nextLine();
      
      FinalExam finish = new FinalExam( intake );
      
      System.out.println( finish.calculator() );
   }
}      