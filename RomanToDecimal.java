import java.util.*;

public class RomanToDecimal
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String R = in.nextLine();
        System.out.println("Converted to Decimal: " + RomanToDecimal(R));
    }

    static int RomanToDecimal(String R)
    {
        int Decimal = 0;
        char Previous;

        for (int x = 0; x < R.length(); x++)
        {
            Previous = R.charAt(x);
            if(R.charAt(x) == 'I')
                Decimal += 1;

            if(R.charAt(x) == 'V')
            {
                if (Previous == 'I')
                    Decimal -= 1;
                else
                    Decimal += 5;
            }

            if(R.charAt(x) == 'X')
            {
                if (Previous == 'I')
                    Decimal-= 1;
                else
                    Decimal+= 10;
            }

            if(R.charAt(x) == 'L')
            {
                if (Previous == 'X')
                    Decimal -= 10;
                else
                    Decimal+=50;
            }

            if(R.charAt(x) == 'C')
            {
                if (Previous == 'X')
                    Decimal -= 10;
                else
                    Decimal += 100;
            }

            if(R.charAt(x) == 'D')
            {
                if (Previous == 'C')
                    Decimal -= 100;
                else
                    Decimal += 500;
            }

            if(R.charAt(x) == 'M')
            {
                if (Previous == 'C')
                    Decimal -= 100;
                else
                    Decimal+= 1000;
            }

            Previous = R.charAt(x);
        }

        return Decimal;
    }
}