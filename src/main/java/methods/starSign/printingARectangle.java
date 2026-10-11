package methods.starSign;

public class printingARectangle
{
    public static void main(String[] args)
    {
        printStars(17,3);
    }

    public static void printStars(int width, int height)
    {
        for(int j=0; j<height; j++)
        {
            for(int i=0; i<width; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printRectangle(int width, int height)
    {
        printStars(width, height);
    }
}
