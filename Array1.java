import java.util.Scanner;
public class Array1
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int intArray[]={10, 20, 30, 40, 50};
		System.out.println("Enter an index to be erased");
		int index=input.nextInt();
		intArray[index]=0;
		for(int i=0; i<intArray.length; i++)
		{
			if(intArray[i]!=0)
			{
				System.out.print(intArray[i]+" ");
			}
		}

	}
}
