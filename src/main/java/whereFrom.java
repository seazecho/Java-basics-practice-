import java.util.Scanner;

public class whereFrom
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Where to? ");
        int to = Integer.parseInt(sc.nextLine());
        System.out.print("Where from ");
        int from = Integer.parseInt(sc.nextLine());
        for(int i=from;i<=to;i++)
        {
            System.out.println(i);
        }

    }
}
