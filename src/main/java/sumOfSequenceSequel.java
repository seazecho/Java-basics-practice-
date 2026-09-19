import java.util.Scanner;

public class sumOfSequenceSequel
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("First number: ");
        int first = Integer.parseInt(sc.nextLine());
        System.out.print("Second number: ");
        int second = Integer.parseInt(sc.nextLine());
        int result = 0;
        for(int i=first;i<=second;i++)
        {
            result += i;
        }
        System.out.println("Sum: " + result);
    }
}
