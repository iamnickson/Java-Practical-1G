import java.util.Scanner;
public class Array
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int intArray[]={20, 10, 50, 40, 30};
		System.out.println("Enter a number to be erased");
		int num=input.nextInt();
		//boolean findArray=false;
		for(int i=0; i<intArray.length; i++)
		{
			//if (intArray[i]==num)
			{
				//findArray=true;
				//intArray[i]=0;
				//if(intArray[i]!=0)
				{
					//System.out.print(intArray[i]+" ");
				}
			}
			if(intArray[i]!=num)
			{
				System.out.print(intArray[i]+" ");
			}
		}
	}
}

