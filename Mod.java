import java.util.Scanner;
public class Mod
{
	public static int mod(int a, int n)
	{
		int mod=0;
		{
			if(a>=0)
				mod=a%n;
			else if(a<0)
			{
				int b=(a*(-1))/n;
				int temp=b;
				int d=temp+1;
				int c=d*n;
				mod=c+a;
			}
		}
		return mod;
	}
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the divident");
		int a=input.nextInt();
		System.out.println("Enter the divisor");
		int n=input.nextInt();
		if(n<=0)
			System.out.println("Enter the positive divisor");
		else
		{
			int value=mod(a, n);
			System.out.println(a+" mod "+n+" is "+value);
		}
		
	}
}