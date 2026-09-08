package Loops;
import java.util.*;
public class Example
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sc.nextInt();


        while (num > 0) {
            int digit = num % 10;
            num = num / 10;

            System.out.println(digit);
        }
        System.out.println(num);
        System.out.println("Loop ends");
    }

}
