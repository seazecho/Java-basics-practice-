package methods;

public class greatest
{
    public static void main(String[] args)
    {
        System.out.println("Greatest: " + greatest(10,100,50));
    }

    public static int greatest(int n1, int n2, int n3)
    {
        if(n1>n2)
        {
            if(n1>n3)
            {
                return n1;
            }
            else
            {
                return n3;
            }
        }
        else
        {
            if(n2>n3)
            {
                return n2;
            }
            else
            {
                return n3;
            }
        }
    }

    // ChatGPT code
//    public static int greatest(int n1, int n2, int n3) {
//        int greatest = n1;
//
//        if (n2 > greatest) {
//            greatest = n2;
//        }
//
//        if (n3 > greatest) {
//            greatest = n3;
//        }
//
//        return greatest;
//    }
}
