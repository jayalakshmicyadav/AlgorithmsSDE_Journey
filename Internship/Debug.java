import java.util.Scanner;
public class Debug{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int sum = 0;

        System.out.println("Enter 5 numbers for first set:");

        for (int i = 1; i <= 5; i++) {
            int number = in.nextInt();
            sum = sum + number;
        }

        System.out.println("Enter 5 numbers for second set:");

        for (int i = 1; i <= 5; i++) {
            int number = in.nextInt();
            sum = sum + number;
        }

        System.out.println("Total = " + sum);
    }
}