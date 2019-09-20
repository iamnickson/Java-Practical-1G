import java.util.Scanner;
public class TestTop
{
	public static void main(String args [])
	{
		Scanner input=new Scanner(System.in);

		System.out.println("Enter the length of empty Stack");
		int l=input.nextInt();
		Top p=new Top(l);
		System.out.println("Enter the elements of Stack");
		for(int i=0; i<l; i++)
		{
			p.push(input.nextInt());
		}
		System.out.println("Enter the element which has to be checked");
		int elt=input.nextInt();
		boolean NotMatching=true;
		for(int i=0; i<l; i++)
		{
			if(elt==p.peek())
			{
				NotMatching=false;
				break;
			}
			else
			{
				p.pop();
			}
		}
		if(!(NotMatching))
		{
			System.out.println(elt + " exists and its location with respect to top is "+(l-p.size()-1));
		}
		else
		{
			System.out.println(elt + " does not exist");
		}
	}
}
