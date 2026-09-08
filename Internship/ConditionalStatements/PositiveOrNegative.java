import java.util.Scanner;

public class PositiveOrNegative
{
   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("enter num");
      int var2 = var1.nextInt();
      if (var2 > 0) {
         System.out.println("postive");
      } else if (var2 < 0) {
         System.out.println("negative");
      } else {
         System.out.println("null");
      }

   }
}