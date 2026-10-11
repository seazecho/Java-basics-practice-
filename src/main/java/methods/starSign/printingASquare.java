package methods.starSign;

public class printingASquare
{
    public static void main(String[] args)
    {
        printSquare(6);
    }

    public static void printStars(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printSquare(int size)
    {
        printStars(size);
    }
}
