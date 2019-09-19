import java.util.Scanner;
public class RecursiveFibbinocci
{
	public static int fibb(int n)
	{
		if(n==1||n==2)
		{
			return 1;
		}
		else
		{
			return fibb(n-1)+fibb(n-2);
		}
	}
	
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the index of Fibbinocci series to get the corresponding member");
		int n=input.nextInt();
		
		int value=0;
		value=fibb(n);
		System.out.println(n+"th Fibbinocci series element is "+value);	
	}
}