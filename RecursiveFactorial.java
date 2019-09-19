import java.util.Scanner;
public class RecursiveFactorial
{
	public static int fact(int n)
	{
		int fact=1;
		if(n==1)
			return fact;
		else
			return n*fact(n-1);
	}
	
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number for which you want to calculate the factorial");
		int n=input.nextInt();
		int value=0;
		
		if(n==0)
		{
			System.out.println(n+"! is 1");
		}
		else if(n<0)
		{
			System.out.println("Enter a positive integer");
		}
		else if(n>0)
		{
			value=fact(n);
			System.out.println(n+"! is "+value);
		}	
	}
}