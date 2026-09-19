import java.util.Scanner;

public class numberOfNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int count =0;
        while(true)
        {
            System.out.print("Give a number: ");
            var number = Double.parseDouble(sc.nextLine());
            if(number==0)
            {
                System.out.println("Number of numbers: " + count);
                break;
            }
            else
            {
                count = count + 1;
                continue;
            }
        }
    }
}
