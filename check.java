import java.util.Scanner;
public class check
{
	public static void main(String args [])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a word to check whether it is Plaindrome or not");
		String wo=input.next();
		char hi[]=new char[5];
		for(int i=0; i<5; i++)
		{
			hi[i]=wo.charAt(i);
		}
		for(int i=0; i<5; i++)
		{
			System.out.println(hi[i]);
		}
	}
}