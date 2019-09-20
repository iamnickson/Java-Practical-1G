public class TestRandomizedQuickSort
{
	public static void toString(int [] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String args [])
	{
		RandomQuickSort m= new RandomQuickSort();
		int A []={40, 15, 25, 28, 50, 5, 85, 75, 10, 8, 7, 0};
		m.RandomizedQuickSort(A,0,A.length-1);
		toString(A);
	}
}