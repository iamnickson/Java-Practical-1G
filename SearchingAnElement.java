import java.util.Scanner;
public class SearchingAnElement
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("This program is to find out the existance of an element in a given Array");
		System.out.println("Enter the element to which you want to check the Existance");
		int num=input.nextInt();
		int[] primes={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		int low=0;
		int high=((primes.length)-1);
		int mid;
		boolean existance=false;
				
		while(low<high)
		{
			mid=((low+high)/2);
			
			if(primes[mid]==num)
			{
				existance=true;
			}else if(primes[mid]<num){
			low=mid+1;
			
			}else if(primes[mid]>num){
				high=mid;
				
			}
			//else if(low>=((primes.length)){
				//existance=false;
			//}
		}
		
		if(existance==true)
			System.out.println(num+" Exists");
		
		if(existance==false)
			System.out.println(num+" Doesn't Exist");
	}
}