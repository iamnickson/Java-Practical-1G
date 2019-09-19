import java.util.Scanner;
public class RecursiveAddition
{
	public static int sum(int n)
	{
		int value=1;
		if(n==1)
		{
			return value;
		}
		else
		{
			value=n+sum(n-1);
		}
		return value;
	}
	
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the supremum");
		int n=input.nextInt();
		
		int value=0;
		value=sum(n);
		System.out.println("Sum of first "+n+" element(s) is "+value);	
	}
}