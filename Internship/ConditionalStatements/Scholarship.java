import java.util.Scanner;

public class Scholarship
 {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter marks");
      int marks = sc.nextInt();
      System.out.println("Income of Family");
      int Income = sc.nextInt();
      
      if(marks > 35)
      {
        if(Income < 15000)
        {
        System.out.println("Scholarship  Approved"); 
        }
        else
       {
        System.out.println(" Not eligible for Scholarship ");
       }
      }
      
       

    }
}