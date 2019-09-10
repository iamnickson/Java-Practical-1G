public class Star
{
	public static void main(String args[])
	{
		int num1,num2,num3;
		for(num1=1; num1<=5; num1++)
		{
			for(num2=4; num2>=num1; num2--)
			{
				System.out.print(" ");
			}
			for(num3=1; num3<=(num1); num3++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}