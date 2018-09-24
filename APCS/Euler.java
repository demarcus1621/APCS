public class Euler
{
	private int newa;
	private int newb;

	public Euler()
	{
	}

	public int euler( int a, int b )
	{
		if( a == b )
		{
			return a;
		}
		else if( a > b )
		{
			return euler( a - b , b );
		}
		else if ( a < b )
		{
			return euler ( a , b - a );
		}
		return 0;
	}

	public int iteuler( int a , int b )
	{
		while ( a != b )
		{
			if( a > b )
			{
				a -= b;
			}
			else
			{
				b -= a;
			}
		}
		return a;
	}
}