import java.util.Scanner;
public class Perm
{
	public static String permu(int n)
	{
		String B="";
		String []A={"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		for(int i=0; i<=n-1; i++)
		{
			B=B+A[i];
		}
		return perm(B);
	}
	public static String perm(String B)
	{
		char[] char_arr=B.toCharArray();
	    return helper(char_arr,0);
	}
	public static String helper(char[] char_arr, int i)
		{
			 String str="";
	    	if(i==char_arr.length-1)
	    	{
	            str="";
	            for(int j=0; j<char_arr.length; j++)
	            {
	                str=str+char_arr[j];
	            }
	            System.out.println(str);
	    	}
	    	else
	    	{
	    		for(int j=i; j<char_arr.length; j++)
	    		{
	        		char tmp = char_arr[i];
	        		char_arr[i] = char_arr[j];
	       	 		char_arr[j] = tmp;
	       	 		helper(char_arr,i+1);
	        		char tmp1 = char_arr[i];
	        		char_arr[i] = char_arr[j];
	        		char_arr[j] = tmp1;
	    		}
			}
			return str;
	}
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Number of letters");
		int n=input.nextInt();
		if(n>26||n<=0)
		{
			System.out.println("Enter inbetween 1 and 26");
		}
		else
		{
			String value=permu(n);
			System.out.println(value+" ");
		}
	}
}
