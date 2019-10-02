import java.util.Scanner;
public class FactorialSubProgram
{
	public static int factorial(int n)
	{
		int fact=1;
		for(int i=n; i>=1; i--)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number for which you want to calculate the factorial");
		int n=input.nextInt();
		int value=factorial(n);
		if(n==0)
			System.out.print(n+"! is 1");
		else if(n<0)
			System.out.print("Enter a positive integer");
		else
			System.out.print(n+"! is "+value);
		
		
		
	}
}