import java.util.Scanner;
import java.io.InputStream;

public class Eulertest
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner( System.in );
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		Euler test = new Euler();
		System.out.println( test.euler( a , b ) );
		System.out.println( test.iteuler( a , b ) );
	}
}