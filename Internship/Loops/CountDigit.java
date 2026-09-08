package Loops;
import java.util.*;
public class CountDigit
    {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println(" Enter number : ");
            int num = sc.nextInt();
            int count = 0;

            while(num>0)
            {
               // int digit = num %10;
                num =num/10;
                count ++;
             //  System.out.print(digit);
            }
            System.out.print("count: " + count);
        }
    }
