public class Sort
{
	public static void main(String args[])
	{
		int myArray[]={100, 20, 50, 30, 40, 80, 60, 70};
		int temp;
		for(int i=1; i<myArray.length; i++)
		{
			for(int j=i-1; j>=0; j--)
			{
				if(myArray[j]>myArray[i])
				{
					temp=myArray[i];
					myArray[i]=myArray[j];
					myArray[j]=temp;
					i=i-1;
				}
			}
		}
		for(int i=0; i<myArray.length; i++)
		{
			System.out.print(myArray[i]+" ");
		}
	}
}