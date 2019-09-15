public class BubbleSort
{
	public static void main(String args[])
	{
		System.out.println("Sorting the elements of the Array by using Bubble Sort");
		/* int A[]={80, 10, 50, 40, 70, 30, 60, 20, 100, 90}; */
		int A[]={100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
		/* int A[]={10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; */
		int temp=0;
		boolean swap=false;
		
		System.out.println("Un sorted Array");
		for(int i=0; i<A.length; i++)
		{
			System.out.print(A[i]+" ");
		}
		System.out.println("");
		
		for(int i=0; i<A.length; i++)
		{
			for(int j=0; j<A.length-1; j++)
			{
				if(A[j+1]<A[j])
				{
					temp=A[j];
					A[j]=A[j+1];
					A[j+1]=temp;
					swap=true;
				}	
			}
			if(swap==false)
				break;
			
		}
		System.out.println("Sorted Array");
		for(int i=0; i<A.length; i++)
		{
			System.out.print(A[i]+" ");
		}
	}
}