import java.util.Scanner;
public class RemovingDuplicate
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("This program is to Remove the Duplicate of an array and to find new array length");
		System.out.println("Enter the number of elements in the array");
		int n=input.nextInt();
		int arrayA[]=new int[n];

		System.out.println("Enter the elements of your array");
		for(int i=0; i<n; i++)
		{
			arrayA[i]=input.nextInt();
		}

		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(arrayA[i]==arrayA[j])
				{
					arrayA[j]=arrayA[n-1];
					n--;
					j--;
				}
			}
		}
		System.out.println("");
		System.out.print("New length is "+n);
		System.out.println("");
		System.out.println("New array is ");

		int m=arrayA.length;
		for(int i=0; i<m; i++)
		{
			for(int j=i+1; j<m; j++)
			{
				if(arrayA[i]==arrayA[j])
				{
					arrayA[j]=1000;
				}
			}
		}
		for(int i=0; i<m; i++)
		{
			if(arrayA[i]!=1000)
			{
				System.out.print(arrayA[i]+" ");
			}
		}
	}
}
