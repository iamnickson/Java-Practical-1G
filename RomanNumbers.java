import java.util.Scanner;
public class RomanNumbers
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Decimal number which has to be converted to Roman Number");
		int num=input.nextInt();
		String str="";//Initializing 'roman' to empty string
		String roman[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    	int decimal[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    	for (int i=0; i<13; i++) // i<13 because the total unique numbers stored in the above array=13
    	{
			while (num >= decimal[i])
		 		 {
					 num = num-decimal[i];
					 str = str+roman[i];
				 }
		 }
		 System.out.println("Roman Equivalent of "+num+" is "+str);
	 }
 }

