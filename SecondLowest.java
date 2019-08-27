import java.util.Scanner;
public class SecondLowest
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("This program is to find the second lowest elements in an Array");
		System.out.println("Enter the array length");

		int n=input.nextInt();
		int array[]=new int[n];
		int min1;
		int min2;

		System.out.println("Enter the elements of array");
		for(int k=0; k<n; k++)
		{
			array[k]=input.nextInt();
			//System.out.print(array[k]+" ");
		}
		System.out.println("");

		if(array[0]<array[1])
		{
			min1=array[0];
			min2=array[1];
		}
		else
		{
			min1=array[1];
			min2=array[0];
		}

		System.out.println("Second smallest in the array");

		for(int i=2; i<array.length; i++)
		{
			if(array[i]<min1)
			{
				min1=array[i];
			}
			else if(array[i]>min1 && array[i]<min2)
			{
				min2=array[i];
			}
		}
		System.out.println("Second smallest in the array is "+min2);
		System.out.println("Smallest in the array is "+min1);
	}
}
