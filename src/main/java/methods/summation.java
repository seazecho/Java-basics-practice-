package methods;

import java.util.Scanner;

public class summation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int summation = sum(1,1,1,1);
        System.out.println("Sum: " + summation);
    }

    public static int sum(int n1, int n2, int n3, int n4)
    {
        return n1+n2+n3+n4;
    }
}
