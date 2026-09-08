import java.util.*;
public class Admission
 {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter marks");
      int marks = sc.nextInt();
      System.out.println("Exam Passed ?");
      boolean ExamPassed = sc.nextBoolean();

      if(marks >= 85 && ExamPassed == true)
      {
        System.out.println("eligible to admission");
      }
      else
      {
        System.out.println(" Not eligible to admission");
      }
    }
}