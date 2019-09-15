import java.util.Scanner;
public class Check
{
	public static int similar(int A[], int B[])
	{
		int count=0;
		if(A.length==B.length)
		{
			count=count+1;
			for(int i=0; i<A.length; i++)
			{
				if(A[i]==B[i])
					count=count+1;
			}
		}
		
		return count;
	}
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		boolean check=false;
		System.out.println("Enter the number of elements in array A");
		int na=input.nextInt();
		int A[]=new int[na];
		System.out.println("Enter the elements of array A");
		for(int i=0; i<na; i++)
		{
			A[i]=input.nextInt();
		}
		System.out.println("Enter the number of elements in array B");
		int nb=input.nextInt();
		int B[]=new int[nb];
		System.out.println("Enter the elements of array B");
		for(int i=0; i<nb; i++)
		{
			B[i]=input.nextInt();
		}
		System.out.println("Array length and corresponding pairs of elements are equal");
		int value=similar(A, B);
		
		if(value==(A.length+1))
		{
			check=true;
			System.out.println("True");
		}
		else
		{
			check=false;
			System.out.println("False");
		}
	}
}