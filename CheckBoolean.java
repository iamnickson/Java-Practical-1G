import java.util.Scanner;
public class CheckBoolean
{
	public static boolean similar(int A[], int B[])
	{
		boolean check=false;
		if(A.length==B.length)
		{
			check=true;
			int count=0;
			for(int i=0; i<A.length; i++)
			{
				if(A[i]==B[i])
					count=count+1;
			}
			if(count!=A.length)
				check=false;
		}
		return check;
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
		boolean value=similar(A, B);
		
		if(value)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}