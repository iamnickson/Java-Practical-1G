public class TestQuickSort
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
		QuickSort m= new QuickSort();
		int A []={40, 15, 25, 50, 5, 85, 75, 10, 8, 7};
		//int A []={40, 15, 25,50};
		m.quickSort(A,0,A.length-1);
		toString(A);
	}
}