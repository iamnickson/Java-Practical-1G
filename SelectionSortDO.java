public class SelectionSortDO
{
	public static void main(String args[])
	{
		System.out.println("Un sorted Array");
		int A[]={20, 10, 50, 40, 70, 60, 30, 80, 100, 90};
		int temp=0;
		int n=A.length;
		for(int i=0; i<n; i++)
		{
			System.out.print(A[i]+" ");
		}
		System.out.println("");
		for(int i=n-1; i>=0; i--)
		{
			int max=i;
			for(int j=0; j<i; j++)
			{
				if(A[j]<A[max])
					max=j;
			}
			if(max!=i)
			{
				temp=A[max];
				A[max]=A[i];
				A[i]=temp;
			}
		}
		System.out.println("Sorted Array");
		for(int i=0; i<n; i++)
		{
			System.out.print(A[i]+" ");
		}
	}
}