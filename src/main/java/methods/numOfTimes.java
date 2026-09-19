package methods;

import java.util.Scanner;

public class numOfTimes
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        greet(1+2);
    }

    public static void greet(int times)
    {
        int i=0;
        while(i < times)
        {
            System.out.println("Greetings!");
            i++;
        }
    }
}
