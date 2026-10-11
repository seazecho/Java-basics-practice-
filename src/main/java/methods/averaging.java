package methods;

public class averaging
{
    public static void main(String[] args)
    {
        System.out.println("Average: " + average(7,7,7,7));
    }

    public static int sum(int n1, int n2, int n3, int n4)
    {
        int sum = n1+n2+n3+n4;
        return sum;
    }

    public static double average(int n1, int n2, int n3, int n4)
    {
        double average = (double) sum(n1,n2,n3,n4) / 4;
        return average;
    }
}
