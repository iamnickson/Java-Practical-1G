import java.util.Scanner;
public class NumberOfOddAndEven
{
	public static void main(String args[])
	{
		Scanner input= new Scanner(System.in);
		System.out.println("This program is to find the Number Of Odd And Even in an Array");
		System.out.println("Enter the number of elements in array");
		int n=input.nextInt();
		int array[]=new int[n];

		int even=0;
		int odd=0;

		System.out.println("Enter the elements in array");
		for(int j=0; j<n; j++)
		{
			array[j]=input.nextInt();

		}
		System.out.println("Even elements");
		for(int i=0; i<n; i++)
		{
			if(array[i]%2==0)
			{
				even=even+1;
				System.out.print(array[i]+" ");
			}
		}
		System.out.println("");
		System.out.println("Number of even numbers is "+even);

		System.out.println("Odd elements");
		for(int i=0; i<n; i++)
		{
			if(array[i]%2!=0)
			{
				odd=odd+1;
				System.out.print(array[i]+" ");
			}
		}
		System.out.println("");
		System.out.println("Number of odd numbers is "+odd);
	}
}