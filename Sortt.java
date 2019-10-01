import java.util.*;
public class Sortt
{
	public static void main(String[] arguments)
	{
		int Am[]={20, 10, 50, 40, 70, 60, 30, 80, 100, 90};
		int n=Am.length;
		
		Arrays.sort(Am);
		for(int i=0; i<n; i++)
		{
			System.out.print(Am[i]+" ");
		}
	}
}