import java.util.Scanner;

public class numberAndSumOfNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int count=0;
        int sum =0;
        while(true)
        {
            System.out.print("Give a number: ");
            int input = Integer.parseInt(sc.nextLine());
            if(input==0)
            {
                break;
            }
            count++;
            sum = sum + input;
        }
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);
    }
}
