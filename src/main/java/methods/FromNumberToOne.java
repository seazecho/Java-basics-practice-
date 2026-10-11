package methods;

public class FromNumberToOne
{
    public static void main(String[] args)
    {
        printUntilNumber(8);
    }

    public static void printUntilNumber(int number)
    {
        for(int i=number; i>0; i--)
        {
            System.out.println(i);
        }
    }
}
