import java.util.Scanner;
public class tooMuchorTooLittle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int first = Integer.valueOf(sc.nextLine());
        System.out.print("Enter a second number: ");
        int second = Integer.valueOf(sc.nextLine());

        if(first+second>=100)
        {
            System.out.println("too much.");
        }
        else if(first+second<=0)
        {
            System.out.println("too little");
        }
        else
        {
            System.out.println("ok");
        }
    }
}
