package methods.starSign;

public class printingATriangle
{
    public static void main(String[] args)
    {
        printTriangle(4);
    }

    public static void printStars(int size)
    {
        for(int i=1; i<=size; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printTriangle(int size)
    {
        printStars(size);
    }
}
