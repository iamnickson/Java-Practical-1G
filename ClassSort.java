import java.util.*;
 class ClassSort 
{
	public static void main(String[] arguments) 
	{
		String names[] = { "Peter", "Patricia", "Hunter", "Sarah",
		"Gabe", "Gina", "Rob", "John" };
		System.out.println("The original order");
		
		for (int i = 0; i < names.length; i++)
			System.out.print(names[i]+" ");
		
		System.out.println("");
		Arrays.sort(names);
		System.out.println("The new order");
		
		for (int i = 0; i < names.length; i++)
			System.out.print(names[i]+" ");
	}
}