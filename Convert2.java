import java.util.Scanner;
public class Convert2{
	public static int[] convert(int n){
		int r=0;
		int k=0;
		int A[]=new int[10];
		while(n!=0)
		{	int a=n/2;
			r=n-(a*2);
			A[k]=r;
			k=k+1;
			n=a;
			if(n==0)
				break;
		}
		int B[]=new int[k];
		for(int i=0; i<k; i++){
			B[i]=A[i];
		}
		return B;
	}
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the decimal number");
		int n=input.nextInt();
		int binA[]=convert(n);
		for(int i=binA.length-1; i>=0; i--){
			System.out.print(binA[i]+" ");
		}
	}
}