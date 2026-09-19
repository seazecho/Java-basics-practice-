import java.util.Scanner;
public class Number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pick a number between 1 and 100: ");
        int number = sc.nextInt();
        System.out.println(number);
        if(number%3==0 && number%5==0)
        {
            System.out.println("FizzBuzz!");
        }
        else if(number%3==0)
        {
            System.out.println("Fizz");
        }
        else if(number%5==0)
        {
            System.out.println("Buzz");
        }
        else
        {
            System.out.println(number);
        }
    }
}
