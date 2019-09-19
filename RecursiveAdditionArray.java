import java.util.Scanner;
public class RecursiveAdditionArray
{
	public static int sum(int A[], int n, )
	{
		int value=0;
		int sum=0;
		int l=0;
		int m=A.length-1;
		if(l==0)
		{
			return A[l]+A[l+1];
		}
		else
		{
			value=A[l]+sum(A[]);
		}
		return value;
	}
	
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the number of elements in an integer array");
		int na=input.nextInt();
		int A[]=new int[na];
		System.out.println("Enter the elements of array A");
		for(int i=0; i<na; i++)
		{
			A[i]=input.nextInt();
		}
		
		int value=0;
		value=sum(A);
		System.out.println(value);	
	}
}