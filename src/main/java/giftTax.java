import java.util.Scanner;
public class giftTax
{
    public static void main(String args[])
    {
        System.out.print("Value of your gift? ");
        Scanner sc = new Scanner(System.in);
        float value = sc.nextInt();
        float k5 = 5000;
        float k5_lower_limit = 100;
        float k5_tax_rate = 0.08F;

        float k25 = 25000;
        float k25_lower_limit = 1700;
        float k25_tax_rate = 0.10F;

        float k55 = 55000;
        float k55_lower_limit = 4700;
        float k55_tax_rate = 0.12F;

        float k200 = 200000;
        float k200_lower_limit = 22100;
        float k200_tax_rate = 0.15F;

        float m1 = 1000000;
        float m1_lower_limit = 142100;
        float m1_tax_rate = 0.17F;

        float result=0;
        if(value<5000)
        {
            System.out.println("No tax!");
        }
        else if (value <= 25000)
        {
            result = k5_lower_limit + ((value - k5) * k5_tax_rate);
            System.out.println("Tax: " + result);
        }
        else if (value <= 55000)
        {
            result = k25_lower_limit + ((value - k25) * k25_tax_rate);
            System.out.println("Tax: " + result);
        }
        else if (value <= 200000)
        {
            result = k55_lower_limit + ((value - k55) * k55_tax_rate);
            System.out.println("Tax: " + result);
        }
        else if (value <= 1000000)
        {
            result = k200_lower_limit + ((value - k200) * k200_tax_rate);
            System.out.println("Tax: " + result);
        }
        else if (value >= 1000000)
        {
            result = m1_lower_limit + ((value - m1) * m1_tax_rate);
            System.out.println("Tax: " + result);
        }
    }
}
