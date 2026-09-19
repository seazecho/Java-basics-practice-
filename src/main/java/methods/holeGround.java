package methods;

import java.util.Scanner;

public class holeGround
{
    public static void main(String[] args)
    {
        System.out.print("How many times? ");
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        for(int i=1; i<=input; i++)
        {
            printText();
        }

    }

    public static void printText()
        {
            System.out.println("In a hole in the ground there lived a method.");
        }
}
