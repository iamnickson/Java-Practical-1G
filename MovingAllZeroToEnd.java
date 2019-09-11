import java.util.Scanner;
public class MovingAllZeroToEnd
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("This program is to move all zero to the end of an array");
		System.out.println("Enter the number of elements in the array");
		int n=input.nextInt();
		int arrayA[]=new int[n];
		int arrayB[]=new int[n];
		int arrayC[]=new int[n];
		int count1=0;
		int count2=0;
		int j=0;
		int k=0;
		System.out.println("Enter the elements of your array");
		for(int i=0; i<n; i++)
		{
			arrayA[i]=input.nextInt();
		}
		System.out.println("Your progressed array is");
		for(int i=0; i<n; i++)
		{
			if(arrayA[i]==0)
			{
				arrayC[j]=arrayA[i];
				count1=count1+1;
				j=j+1;
			}
			else
			{
				arrayB[k]=arrayA[i];
				count2=count2+1;
				k=k+1;
			}
		}
		for(int i=0; i<count2; i++)
		{
			System.out.print(arrayB[i]+" ");
		}
		for(int i=0; i<(count1); i++)
		{
			System.out.print(arrayC[i]+" ");
		}
	}
}
