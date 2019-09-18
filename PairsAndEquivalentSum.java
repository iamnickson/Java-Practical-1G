import java.util.Scanner;
public class PairsAndEquivalentSum
{
	public static void main(String args[])
	{
		Scanner inut= new Scanner(System.in);
		System.out.println("This program is to find the pairs of no. in an array which is equivalent to the input");
		System.out.println("Enter the number that has to be checked");
		int num=inut.nextInt();
		int array[]={5,10,15,12,16,14,20,18,8,4,6,1,2,3,7,9};
		boolean found=false;
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array.length; j++)
			{
				if(num==array[i]+array[j])
				{
					found=true;
					System.out.println(num+" = "+array[i]+"	+ "+array[j]);
				}
			}
			array[i]=1000;
		}
		if(found==false)
		{
			System.out.println("There are no pairs found for your given input");
		}
	}
}