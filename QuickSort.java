public class QuickSort
{
	public void quickSort(int arr[], int low, int high)
	{
		if(low<high)
		{
			int p=partition(arr, low, high);
			quickSort(arr, low, p-1);
			quickSort(arr, p+1, high);
		}
	}
	public int partition(int arr[], int low, int high)
	{
		int pivot=arr[high];
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