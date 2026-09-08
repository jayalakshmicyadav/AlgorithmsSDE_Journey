package Loops;
import java.util.*;
public class ReverseDigit
    {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number : ");
            int num = sc.nextInt();
            int reverse = 0;
            //int num;
            while(num <  0 )
            {
                int digit = num%10;
                reverse = (reverse*10) + digit;
                num = num/10;
            }
                System.out.println(reverse);
        }
    }
