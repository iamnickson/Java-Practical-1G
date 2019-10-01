public class SubProgram
{
	public static double harmonic(int n)
	{
		double sum=0.0;
		for(int i=1; i<=n; i++)
		{
			sum=1.0/i;
		}
		return sum;
	}
	public static void main(String args[])
	{
		for(int i=1; i<=4; i++)
		{
			double value=harmonic(i);
			System.out.println(value);
		}
	}
}