import java.util.Scanner;
public class GCDRecurssion
{
	public static int gcd(int n1, int n2)
	{
		if(n2>n1)
		{
			int temp=n1;
			n1=n2;
			n2=temp;
		}
		if(n2==0)
		{
			return n1;
		}
		n1=n1%n2;
		int k=n2;
		n2=n1;
		n1=k;
		return gcd(n1, n2);
	}
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("This program is to find the GCD of two positive integers");
		System.out.println("Enter the First number");
		int n1=input.nextInt();
		System.out.println("Enter the Second number");
		int n2=input.nextInt();
		
		int value=0;
		value=gcd(n1, n2);
		System.out.println(value);	
	}
}