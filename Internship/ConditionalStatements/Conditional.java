package ConditionalStatements;
import java.util.Scanner;
class Conditional
{
    public static void main(String[] args)
    {
       // int age = 25;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        System.out.println("Indian citizenship : True/False");
        boolean citizen = sc.nextBoolean(); //should be stored as true or false so boolean is used

        if(age >= 18)
        {
            if(citizen)
            {
                System.out.println("Eligible");
            }
            else
            {
                System.out.println("Not Eligible");
            }
            // System.out.println("Eligible");
        }
        else
        {
            System.out.println("Not Eligible");
        }
    }
}