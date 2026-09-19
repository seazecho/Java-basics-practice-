import java.util.Scanner;

public class sumOfSequence
{
    public static void main(String[] args)
    {
        System.out.print("Last number: ");
        Scanner sc = new Scanner(System.in);
        int limit = Integer.parseInt(sc.nextLine());
        int result = 0;
        for(int i=1;i<=limit;i++)
        {
            result += i;
        }
        System.out.println("Sum: " + result);
    }
}
