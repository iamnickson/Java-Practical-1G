public class BooleanCheck
{
	public static boolean majority(boolean a, boolean b, boolean c)
	{
		return a&b|b&c|a&c|a&b&c;
	}
	public static void main(String args[])
	{
		boolean a=true;
		boolean b=true;
		boolean c=true;
		boolean value=majority(a,b,c);
		System.out.println(value);
	}
}