public class InsertionSort
{
	public static void main(String args[])
	{
		int Array[]={10, 50, 20, 40, 90, 70, 30, 80};
		int a;
		for(int i=1; i<Array.length; i++)
		{
			int value= Array[i];
			int loc=i;
			while(loc>0 && Array[loc-1]>value)
			{
				Array[loc]=Array[loc-1];
				loc=loc-1;
				Array[loc]=value;
			}
		}
		for(int k=0; k<Array.length; k++)
		{
			System.out.print(Array[k]+" ");
		}
	}
}