import java.util.Scanner;
public class eEulerNumber
{
	public static int fact(int n)
	{
		int fact=1;
		for(int i=n; i>=1; i--)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static double findE(int k)
	{
		double e=1.0;
		for(int i=k; i>=1; i--)
		{
			double facto=1.0;
			for(int j=i; j>=1; j--)
			{
				facto=facto*j;
			}
			System.out.println(facto);
			double d=1/facto;
			e=e+d;
		}
		return e;
	}
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number for which you want to calculate the factorial");
		int n=input.nextInt();
		int value=0;
		
		if(n==0)
			System.out.println(n+"! is 1");
		else if(n<0)
			System.out.println("Enter a positive integer");
		else
			value=fact(n);
			System.out.println(n+"! is "+value);
		
		System.out.println("Enter the number for which you want to calculate the Euler's number e");
		int k=input.nextInt();
		double EulerNum=0;
		
		if(k==0)
			System.out.println("e"+k+" is 1");
		else if(k<0)
			System.out.println("Enter a positive integer");
		else
			EulerNum=findE(k);
			System.out.println(n+"! is "+EulerNum);
			
		/* System.out.println("Finding the value of indices with base e");
		System.out.println("Enter the power for an indices with base e");
		int p=input.nextInt();
		double Indices=0; */
		
	}
}