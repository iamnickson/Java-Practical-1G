import java.util.Scanner;
public class Permutations
{
	public static String Permu(String B)
	{
		String[] BArray ;
		for(int i=0; i<=BArray.length-1; i++)
		{
			System.out.println(BArray[i]);
		}
		return "";
	}
	public static String Permutation(int n)
	{
		String[] B=new String[n-1];
		String[]A={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		for(int i=0; i<=n-1; i++)
		{
			B=B+A[i];
		}
		return B;
	}
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value of number of letters");
		int n=input.nextInt();
		
		if(n>26 || n<=0)
		{System.out.println("Enter a number in-between 1 and 26");}
		else
		{
			String value=Permutation(n);
			String P=Permu("");
			System.out.println(B+" ");
		}
	}
}