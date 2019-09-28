import java.util.Scanner;
public class Convert
{
	public static int[] convert(int n)
	{
		int c=0;
		int r=0;
		int A[];
		A[]=new int[10];
		wile(c>=0)
		{
			for(int i=0; i<A.length; i++)
			{
				c=n/2;
				r=n%2;
				A[i]=r;
				if(c==0)
				{break;}
			}
		}
		return A;
	}
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the decimal number");
		int n=input.nextInt();
		int binA[]=convert(n);
		for(int i=0; i<A.length; i++)
		{
			System.out.print(binA[i]+" ");
		}
	}
}