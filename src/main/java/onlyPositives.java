import java.util.Scanner;

public class onlyPositives
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.print("Give a number: ");
            var number = Double.parseDouble(sc.nextLine());
            if(number==0)
            {
                System.out.println("Quitting program..");
                break;
            }
            else if(number<0)
            {
                System.out.println("Unsuitable number");
                continue;
            }
            number = Math.pow(number, 2);
            System.out.println(number);
        }
    }
}
