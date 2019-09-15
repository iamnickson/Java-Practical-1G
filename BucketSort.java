public class BucketSort
{
	public static void main(String args[])
	{
		System.out.println("Sorting the elements of the Array by using Bucket Sort");
		int A[]={160, 10500, 2, 8, 10, 9, 15, 0}; 
		int max=0;
		int place=0;
		
		System.out.println("Un sorted Array");
		for(int i=0; i<A.length; i++)
		{
			System.out.print(A[i]+" ");
		}
		System.out.println("");
		System.out.println("Sorted Array");
		
		for(int j=0; j<A.length; j++)
		{
			if(max<A[j])
			{
				max=A[j];
			}
			if(A[j]==0)
			{
				System.out.print("0 ");
			}	
		}
		int B[]=new int[max+1];
		for(int j=0; j<A.length; j++)
		{
			place=A[j];
			B[place]=place;
		}
		for(int i=1; i<B.length; i++)
		{
			if(B[i]!=0)
			{
				System.out.print(B[i]+" ");
			}
		}
	}
}