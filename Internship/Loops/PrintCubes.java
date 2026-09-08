package Loops;

public class PrintCubes
{
    public static void main(String[] args)
    {

        for(int i = 1; i <= 10; i++)
        {
            System.out.println(i*i*i);
        }


 /*   //Using a separate variable for the square
for(int i = 1; i <= 10; i++)
{
    int square = i * i *i;
    System.out.println(square);
}
*/



/*  //Using Math.pow()
for(int i = 1; i <= 10; i++)
{
    System.out.println(Math.pow(i, 3));
}
*/
    }
}
