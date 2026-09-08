//package Internship.ScannerClass;
import java.util.*;
public class Addition
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b, c ;
        System.out.println("Enter the first number: ");
        a = sc.nextInt();
        System.out.println("Enter the second number: ");        
        b = sc.nextInt();
        c = a + b;
        System.out.println("The sum of two numbers is: " + c);
    }
}