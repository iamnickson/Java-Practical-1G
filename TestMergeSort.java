public class TestMergeSort
{
	public static void toString(int [] arrayA)
	{
		for(int i=0; i<=arrayA.length-1; i++)
		{
			System.out.print(arrayA[i]+" ");
		}
	}
	public static void main(String args [])
	{
		MergeSort m= new MergeSort();
		int A []={25, 12, 85, 50, 45, 65, 10};
		m.sort(A,0,A.length-1);
		toString(A);
	}
}