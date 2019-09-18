public class Negate
{
	public static int negate(int a)
	{
		a=-a;
		return a;
	}
	public static void main(String args[])
	{
		int a=17;
		System.out.println(a);
		
		int b=negate(a);
		System.out.println(b);
	}
}