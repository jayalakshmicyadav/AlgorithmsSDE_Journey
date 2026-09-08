import java.util.*;

public class LargestOfTwo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number1");
        int num1 = sc.nextInt();

        System.out.println("Enter number2");
        int num2 = sc.nextInt();

        if (num1 > num2)
        {
            System.out.println("num1 is Larger");
        }
        else if(num2 > num1)
        {
            System.out.println("num2 is Larger");
        }
        else
        {
            System.out.println("both equal");
        }
    }
}