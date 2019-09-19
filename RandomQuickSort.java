public class RandomQuickSort 
{
    public static void RandomizedQuickSort(int[] array, int startIndex, int endIndex) 
	{
		if (startIndex < endIndex) {
              int pivot = randomizedPartition(array,startIndex,endIndex);
              RandomizedQuickSort(array,startIndex,pivot - 1);
              RandomizedQuickSort(array,pivot + 1,endIndex);
          }
      }
    public static int randomizedPartition(int[] array, int startIndex, int endIndex) 
	{
          int randomEndIndex = randomNumberBetween(startIndex,endIndex);
          swap(array,endIndex,randomEndIndex);
          return partition(array,startIndex,endIndex);
	}
	public static int randomNumberBetween(int startNumber, int endNumber) 
	{
		return (int)Math.floor(Math.random() * (endNumber - startNumber + 1) + startNumber);
	}
	public static int partition(int[] array,int startIndex,int endIndex) 
	{
		int pivotValue = array[endIndex];
		int pivotIndex = startIndex;

		for (int j = startIndex; j < endIndex; j++) 
		{
			if (array[j] <= pivotValue) 
			{
			swap(array,pivotIndex,j);
			pivotIndex = pivotIndex + 1;
			}
		}
		swap(array,pivotIndex,endIndex);
		return pivotIndex;
	}

	public static void swap(int[] array, int firstIndex, int secondIndex) 
	{
		int temp = array[firstIndex];
		array[firstIndex] = array[secondIndex];
		array[secondIndex] = temp;
	}
  }