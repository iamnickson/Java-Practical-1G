public class Change
{
	public static void main(String args  [])
	{
		int A[]={1, 2, 3, 4, 5};
		int i=0;
		while(i<A.length-1)
		{
			A[i]=A[i+1];
			i=i+1;
		}
		for(int j=0; j<A.length; j++)
		{
			System.out.println(A[j]);
		}
	}
}