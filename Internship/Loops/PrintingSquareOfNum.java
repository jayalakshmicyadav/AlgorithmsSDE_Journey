package Loops;

public class PrintingSquareOfNum
{
    public static void main(String[] args)
    {
         /*
      for(int i = 1; i <= 10; i++)
      {
        System.out.println(i*i);
      }
 */



 /*  //Using a separate variable for the square
for(int i = 1; i <= 10; i++)
{
    int square = i * i;
    System.out.println(square);
}
    */


/* //Using Math.pow()
for(int i = 1; i <= 10; i++)
{
    System.out.println(Math.pow(i, 2));
}
*/

//Without i * i — using addition

        int square = 0;

        for(int i = 1; i <= 10; i++)
        {
            square = square + (2 * i - 1);
            System.out.println(square);
        }
    }
}
