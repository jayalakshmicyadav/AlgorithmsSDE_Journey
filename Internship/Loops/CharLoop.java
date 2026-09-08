package Loops;
import java.util.*;
public class CharLoop
    {
        public static void main(String[] args)
        {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Char : ");
         char ch = sc.next().charAt(0);

         for(  ch ='A'; ch <= 'Z' ; ch++)
         {
             if(ch == 'M')
             {
                 break;
             }
             System.out.println(ch + " ");
         }

        }
    }
