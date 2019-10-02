import java.util.Scanner;
public class IndicesSubProgram
{
	public static int negate(int p)
	{
		p=-p;
		return p;
	}
	public static int Indices(int b, int p)
	{
		int value=1;
		for(int i=p; i>=1; i--)
		{
			value=value*b;
		}
		return value;
	}
	public static void main(String args[])
	{
		System.out.println("Values of Indices");
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the base");
		int b=input.nextInt();
		System.out.println("Enter the power");
		int p=input.nextInt();
		if(p<0)
		{
			int c=negate(p);
			
			p=c;
			System.out.println(p);
			int value=Indices(b, p);
			System.out.println(value);
			double V=1.0;
			System.out.print(b+" to the power of "+(p*(-1))+" is "+V/value);
		}
		else
		{
			int Value=Indices(b, p);
			System.out.print(b+" to the power of "+p+" is "+Value);
		}		
	}
}