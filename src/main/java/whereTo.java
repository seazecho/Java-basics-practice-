import java.util.Scanner;

public class whereTo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Where to? ");
        int input = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=input;i++)
        {
            System.out.println(i);
        }

    }
}
