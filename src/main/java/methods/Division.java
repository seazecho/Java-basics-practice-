package methods;

import java.util.Scanner;

public class Division
{
    public static void main(String[] args)
    {
        System.out.println("Division101");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float n1 = sc.nextFloat();
        System.out.print("Enter second number: ");
        float n2 = sc.nextFloat();
        NumberDivision(n1, n2);
    }

    public static void NumberDivision(float number1, float number2)
    {
        float div = number1 / number2;
        System.out.println(div);
    }
}
