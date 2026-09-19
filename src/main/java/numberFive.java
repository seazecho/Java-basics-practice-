import java.util.Scanner;

public class numberFive
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double sum=0;
        double count=0;
        int odd=0;
        int even=0;
        while(true)
        {
            System.out.print("Give a number: ");
            int input = Integer.parseInt(sc.nextLine());
            if(input==-1)
            {
                System.out.println("Thx! Bye!");
                break;
            }
            if(input%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
            sum += input;
            count++;
        }
        System.out.println("Sum: " + (int) sum);
        System.out.println("Numbers: " + (int) count);
        System.out.println("Average: " + sum/count);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
