import java.util.Scanner;
public class absoluteValue
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an number: ");
        int number = Integer.parseInt(sc.nextLine());
        if(number<0)
        {
            number = number * (-1);
            System.out.println(number);
        }
        else
        {
            System.out.println(number);
        }
    }
}
