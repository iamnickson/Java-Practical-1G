public class MergeSort
{
	public void merge(int arrayA[], int low, int middle, int high)
	{
		int n1= middle-low+1;
		int n2=high-middle;
		int A1[]=new int[n1];
		int A2[]=new int[n2];
		for(int i=0; i<n1; ++i)
		{
			A1[i]=arrayA[i+low];
		}
		for(int i=0; i<n2; ++i)
		{
			A2[i]=arrayA[middle+1+i];
		}
		int p1=0, p2=0, k=low;
		while((p1<n1)&&(p2<n2))
		{
			if(A1[p1]<=A2[p2])
			{
				arrayA[k]=A1[p1];
				p1++;
			}
			else
			{
				arrayA[k]=A2[p2];
				p2++;
			}
			k++;
		}
		while(p1<n1)
		{
			arrayA[k]=A1[p1];
			p1++;
			k++;
		}
		while(p2<n2)
		{
			arrayA[k]=A2[p2];
			p2++;
			k++;
		}
	}
	public void sort(int[]arrayA, int low, int high)
	{
		if(low<high)
		{
			int middle=(low+high)/2;
			sort(arrayA,low,middle                                                                                           );
			sort(arrayA, middle+1, high);
			merge(arrayA, low, middle, high);
		}
	}
}