import java.util.Scanner;
public class CheckBoolean
{
	public static boolean majority(boolean a, boolean b, boolean c)
	{
		boolean satisfied;
		switch (value)
		{
			case 1:  satisfied = a&b;
				break;
		    case 2:  satisfied = a&c;
				break;
		    case 3:  satisfied = b&c;
				break;
		    case 4:  satisfied = a&b&c;
				break;
		    default: satisfied = false;
				break;
		}
        return satisfied;
	}
    public static void main(String[] args)
    {
		Scanner input=new Scanner(System.in);

    }
}