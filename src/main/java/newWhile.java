import java.util.Scanner;

public class newWhile
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Exit (press y to exit)");
            String input = sc.nextLine();
            if(input.equals("y") || input.equals("Y"))
            {
                break;
            }
            System.out.println("You are not a quitter eh?");
        }
        System.out.println("Finally you did eh?");
    }
}
