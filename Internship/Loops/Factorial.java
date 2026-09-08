package Loops;
import java.math.BigInteger;
import java.util.*;
public class Factorial{
            public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the number");
                int num = sc.nextInt();
                long Fact = 1;
                for(int i = 1;i <= num ; i++)
                {
                    Fact = Fact * i;
                }
                System.out.println(" Factorial of the " + num + " is " + Fact);
            }
        }
