import java.util.Scanner;
public class Maximum
{
	public static double maximum(double m1, double m2, double m3)
	{
		double max=m1;
		{
		if(m1>m2&&m1>m3)
			max=m1;
		else if(m2>m1&&m2>m3)
			max=m2;
		else if(m3>m1&&m3>m2)
			max=m3;
		}
		return max;
	}
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the 1st number");
		double m1=input.nextDouble();
		System.out.println("Enter the 2nd number");
		double m2=input.nextDouble();
		System.out.println("Enter the 3rd number");
		double m3=input.nextDouble();
		
		double max=maximum(m1, m2, m3);
		System.out.println("The maximum is "+max);
	}
}