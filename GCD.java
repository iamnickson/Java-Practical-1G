import java.util.Scanner;
public class GCD
{
	public static int negate(int p)
	{
		p=-p;
		return p;
	}
	public static int gcd(int p, int q)
	{
		int mod=1;
		int m1;
		int m2;
		if(p>q)
		{
			m1=p;
			m2=q;
		}
		else
		{
			m1=q;
			m2=p;
		}
		while(mod!=0)
		{
			mod=m1%m2;
			if(mod==0)
				break;
			m1=m2;
			m2=mod;
		}
		return m2;
	}
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("This program is to find GCD of two integers");
		System.out.println("Enter the 1st integer");
		int p=input.nextInt();
		int k=p;
		if(p<0)
			p=negate(p);
		System.out.println("Enter the 2nd integer");
		int q=input.nextInt();
		if(q<0)
		{
			int temp=p;
			p=q;
			p=negate(p);
			q=p;
			p=temp;
		}
		int value=gcd(p, q);
		System.out.println("GCD of "+k+" and "+q+" is "+value);
		
	}
}