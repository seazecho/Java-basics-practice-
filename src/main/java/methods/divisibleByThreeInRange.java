package methods;

import java.util.Scanner;

public class divisibleByThreeInRange
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number which will start the range: ");
        int beginning = sc.nextInt();
        System.out.print("Enter your number which will end the range: ");
        int end = sc.nextInt();
        divisibleByThreeInRangeMethod(beginning, end);
    }

    public static void divisibleByThreeInRangeMethod(int beginning, int end)
    {
        for(int i=beginning; i<=end; i++)
        {
            if(i%3==0)
            {
                System.out.println(i);
            }
        }
    }
}
