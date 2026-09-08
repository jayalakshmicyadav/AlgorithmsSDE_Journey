package Loops;
import java.util.*;
public class Palindrome
    {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println( "Enter Number : ");
            int num = sc.nextInt();
            int rev = 0;
            int temp = num;
            while(num > 0 )
            {
                int digit  = num%10;
                rev = rev *10 + digit;
                num = num/10;
            }
            if(temp == rev) /// u compare num == rev there num will have 0 so it compare 0==121 give NOT PLAINDROME
            {
                System.out.println("PALINDROME");
            }
            else
            {
                System.out.println("NOT PALINDROME");
            }

        }
    }
