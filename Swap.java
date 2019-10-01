public class Swap
{
	public static void main(String args[])
	{
		int[]A={1, 2, 3};
		String P=A[0]+"";
		String Q=A[0]+"";
		for(int i=1; i<=A.length-1; i++)
		{
			P=P+A[i];
		}
		for(int i=A.length-1; i>=1; i--)
		{
			Q=Q+A[i];
		}
		System.out.println(P);
		System.out.println(Q);
	}
}