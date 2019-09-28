import java.util.Scanner;
public class CommonElements
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("This program is to find the common elements in an Array");
		System.out.println("Enter the array A length");

		int n=input.nextInt();
		int Aarray[]=new int[n];
		System.out.println("Enter the elements of array A");
		for(int k=0; k<n; k++)
		{
			Aarray[k]=input.nextInt();
		}

		System.out.println("Enter the array B length");
		int n2=input.nextInt();
		int Barray[]=new int[n2];
		System.out.println("Enter the elements of array B");
		for(int k=0; k<n2; k++)
		{
			Barray[k]=input.nextInt();
		}

		System.out.println("Common Elements are");

		for(int i=0; i<Aarray.length; i++)
		{
			for(int j=0; j<Barray.length; j++)
			{
				if(Aarray[i]!=0 && Aarray[i]==Barray[j])
				{
					System.out.println(Aarray[i]+" ");
					Aarray[i]=0;
					Barray[j]=0;
				}
			}
		}
	}
}
