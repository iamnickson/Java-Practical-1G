import java.util.Scanner;
public class OddEven
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Give me the maximum range for which you want to find the sum of odd and even numbers");
		int m=input.nextInt();
		int sum1=0;
		int sum2=0;
		for(int i=1; i<=m; i++)
		{
			if(i%2==1)
			{
				sum1=sum1+i;
			}
			else
			{
				sum2=sum2+i;
			}
		}
		System.out.println("Sum of odd numbers from 0 to (including) "+m+" is "+sum1);
		System.out.println("Sum of even numbers from 0 to (Including) "+m+" is "+sum2);
	}
}