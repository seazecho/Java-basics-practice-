package methods.starSign;

import java.util.Scanner;

public class printingStars
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        printStars(5);
        printStars(3);
        printStars(9);
    }

    public static void printStars(int n)
    {
        for(int i=0; i<n; i++)
        {
            System.out.print("*");
        }
        System.out.println("");
    }
}
