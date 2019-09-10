import java.util.Scanner;
public class SumOfNumbers
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the upper bound upto wich you want to add the numbers from 0");
		int upb=input.nextInt();
		int sum=0;
		for(int i=1; i<=upb; i++)
		{
			sum=sum+i;
		}
		System.out.print("The sum of all positive intergers from 0 to "+upb+" is "+sum);
	}
}

