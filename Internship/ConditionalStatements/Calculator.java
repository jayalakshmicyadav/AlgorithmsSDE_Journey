import java.util.Scanner;
public class Calculator {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter num1");
      int num1 = sc.nextInt();
      System.out.println("Enter num2");
      int num2 = sc.nextInt();
      System.out.println("1. Addition");
      System.out.println("2. Subtraction");
      System.out.println("3. Multiplication");
      System.out.println("4. Division");
      System.out.println("5. Modulus");
      System.out.println("6. Exponent");
      System.out.println("Enter your choice:");
      int choice = sc.nextInt();
      int result;
      switch(choice)
      { 
        case 1: 
        result = num1 + num2;
        System.out.println("addition of entered numbers:"+ result);
        break;

        case 2: 
        result = num1 - num2;
        System.out.println("subtraction of entered numbers:"+ result);
        break;

        case 3: 
        result = num1 * num2;
        System.out.println("Multiplication of entered numbers:"+ result);
        break;

        case 4: 
        result = num1 / num2;
        System.out.println("Division of entered numbers:"+ result);
        break;

        case 5: 
        result = num1 % num2;
        System.out.println("Modulus of entered numbers:"+ result);
        break;

        case 6: 
        result = num1 ^ num2;
        System.out.println("exponent of entered numbers:"+ result);
        break;
      
        default :
         System.out.println("Invalid");
      }
    }
}