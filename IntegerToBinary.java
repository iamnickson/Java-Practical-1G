import java.util.Scanner;
public class IntegerToBinary
{
	public static String ConvertToBin(int a,String s)
	{
		int r;
		String Number=s;
		String backward="";
		if(a==0)
		{
			backward = "";
			for(int i = Number.length()-1; i >= 0; i--) 
			{
				backward = backward + Number.substring(i, i+1);
			} 	
		}
		else
		{
			int n=a/2;
			r=a-(2*n);
			a=n;
			Number=Number+r;
		return	ConvertToBin(a,Number);
		}	
		return backward;
	}
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the decimal number");
		int a=input.nextInt();
		int n;
		
		if(a<=0)
		{System.out.println("Enter a positive decimal number");}
		else
		{
			String value=ConvertToBin(a,"");
			System.out.println(value+" ");
		}
		
	}
}