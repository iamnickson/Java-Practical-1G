import java.util.Scanner;
public class TestPalindrome
{
	public static void main(String args [])
	{
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a word to check whether it is Plaindrome or not");
		String word=input.next();
		int length=word.length();
		Palindrome p=new Palindrome(length);
		for(int i=0; i<length; i++)
		{
			p.enQueue(word.charAt(i));
			p.push(word.charAt(i));
		}
		boolean palindrome=true;
		while(!(p.isStackEmpty()) && !(p.isQueueEmpty()) && (palindrome))
		{
			char elt1=p.pop();
			char elt2=p.deQueue();
			if(elt1!=elt2)
			{
				palindrome=false;
			}
		}
		if(palindrome)
		{
			System.out.println("This is a Palindrome");
		}
		else
		{
			System.out.println("This is not a Palindrome");
		}
	}
}