import java.util.Scanner;
public class TestBalancedParenthesis
{
	public static void main(String args [])
	{
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the expression");
		String expression=input.next();
		int length=expression.length(); 
		boolean matching=false;
		BalancedParenthesis p=new BalancedParenthesis(length);
		for(int i=0; i<length; i++)
		{
			if(expression.charAt(i)=='(' || expression.charAt(i)=='{' || expression.charAt(i)=='[')
				p.push(expression.charAt(i));
			else if(expression.charAt(i)==')' || expression.charAt(i)=='}' || expression.charAt(i)==']')
				{
					if((p.isEmpty())||(p.pop()!=expression.charAt(i)) )
						matching=false;
					else
						p.pop();
				}
			
		}
		if(p.isEmpty())
		{
			System.out.println("This is a BalancedParenthesis");
		}
		else
		{
			System.out.println("This is not a BalancedParenthesis");
		}
	}
}