import java.util.*;
public class RandomizedQuickSort
{
	public static int getRandom(int[] arr) 
	{
		int rnd = new Random().nextInt(arr.length);
		return rnd;
	}
	public void quickSort(int arr[], int low, int high)
	{
		if(low<high)
		{
			int rnd=getRandom(arr);
			int p=partition(arr, low, high, rnd);
			quickSort(arr, low, p-1);
			quickSort(arr, p+1, high);
		}
	}
	public int partition(int arr[], int low, int high, int rnd)
	{
		int pivot=arr[rnd];
		int i=low-1;
		for(int j=low; j<high; j++)
		{
			if(arr[j]<=pivot)
			{
				i++;
				int k=arr[i];
				arr[i]=arr[j];
				arr[j]=k;
			}
		}
		int a=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=a;
		return(i+1);
	}
}