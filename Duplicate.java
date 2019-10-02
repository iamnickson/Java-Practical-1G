public class Duplicate
{
	public static void main(String args[])
	{
		System.out.println("This program is to find the duplicate elements in an Array");
		int elements[]={10, 20, 10, 30, 20, 50, 50, 30, 20, 70, 10};
		int count;
		int count2;
		boolean got=false;

		for(int i=0; i<elements.length; i++)
		{
			count=0;
			count2=0;
			for(int j=0; j<elements.length; j++)
			{
				if(elements[i]==elements[j])
				{
					count=count+1;
				}
			}
			for(int k=i; k>=0; k--)
			{
				if(elements[k]==elements[i])
				{
					System.out.println("Count of "+elements[i]+" is "+count);
				}
			}
		}
	}
}
