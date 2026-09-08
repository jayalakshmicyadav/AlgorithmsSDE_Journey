package Loops;

import java.util.Scanner;

public class MultipyTable
{
    public static void main(String[] args)
    {
        int n,res;
        System.out.println("Enter the number of multiples of table:");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        //Using For Loop
//        for(int i=1;i<=10;i++)
//        {
//            res=n*i;
//            System.out.println(n +"*"+ i + " " + "=" +res);
//        }

        //using while Loop
//        int i=1;
//        while(i<=10)
//        {
//            res=n*i;
//            System.out.println(n +"*"+ i + " " + "=" +res);
//            i++;
//
//        }

        //Using doWhile LOOP
        int i=1;
        do
        {
            res=n*i;
            System.out.println(n +"*"+ i + " " + "=" +res);
            i++;
        }while(i<=10);

        }
}
