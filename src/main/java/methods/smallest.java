package methods;

public class smallest
{
    public static void main(String[] args)
    {
        System.out.println("Smallest: " + smallest(100,7));

    }

    public static int smallest(int n1, int n2)
    {
        if(n1>n2)
        {
            return n2;
        }
        else
        {
            return n1;
        }
    }
}
