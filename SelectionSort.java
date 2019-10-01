public class SelectionSort
{
	public static void main(String args[])
	{
		System.out.println("Un sorted Array");
		int A[]={20, 10, 50, 40, 70, 60, 30, 80, 100, 90};
		int temp=0;
		for(int i=0; i<A.length; i++)
		{
			System.out.print(A[i]+" ");
		}
		System.out.println("");
		for(int i=0; i<A.length; i++)
		{
			int min=i;
			for(int j=i+1; j<A.length; j++)
			{
				if(A[j]<A[min])
					min=j;
			}
			if(min!=i)
			{
				temp=A[min];
				A[min]=A[i];
				A[i]=temp;
			}
		}
		System.out.println("Sorted Array");
		for(int i=0; i<A.length; i++)
		{
			System.out.print(A[i]+" ");
		}
	}
}