import java.util.Scanner;
public class BinarySearch
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("This program is the application of Binary Search");
		System.out.println("Enter the number of elements of the Array");
		int num=input.nextInt();
		int array[]=new int[num];
		System.out.println("Enter the Array elements");
		for(int i=0; i<num; i++)
		{
			array[i]=input.nextInt();
		}
		System.out.println("Enter the Element which you has to search");
		int element=input.nextInt();
		int low=0;
		int high=num-1;

		while(low<=high)
		{
			int mid=(low+high)/2;
			if(array[mid]<element)
			{
				low=mid+1;
			}
			else if(array[mid]==element)
			{
				System.out.println(element+" Exists and its index is "+(mid));
				break;
			}
			else
			{
				high=mid-1;
			}
		}
		if(low>high)
			System.out.println(element+" Does not Exist");
	}
}