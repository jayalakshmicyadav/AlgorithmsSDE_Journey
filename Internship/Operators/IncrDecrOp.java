import java.util.*;
public class IncrDecrOp
{
    public static void main(String[] args)
    {
        //Increment
        int count = 10;
        System.out.println(count++); //10  ,10 count = count + 1
        System.out.println(count); //11
        System.out.println(count++); //11
        System.out.println(count++); //12
        System.out.println(count); //13


        //Decrement

        System.out.println(count--); // 13
        System.out.println(count); //12
        System.out.println(count--); //12
        System.out.println(count--); //11
       

        System.out.println(++count); //11
        System.out.println(count); //11
        System.out.println(++count); //12
        System.out.println(++count); //13

        System.out.println(--count); //12
        System.out.println(count); //12
        System.out.println(--count); //11
        System.out.println(count); //11
       
       
       System.out.println("Assignment"); // 9 => 10

       int store = count;
       store++;
       System.out.println(store); // 

       int count1 = 12;
       int count2 = count1++;
       System.out.println(count2); // 12
       System.out.println(count1); // 13

       int a = 13;
       int b = ++a;
       System.out.println(b); // 14
       System.out.println(a); // 14


       //Behaviour in expressoin
       System.out.println("Behaviour in expression");
       int c = 10;
       System.out.println(c++ + 5); // 10 + 5 = 15
       System.out.println(c); // 11 updated to c as 11(10+ 1)
       System.out.println(++c + 5);// 1=> 12+5=17
       System.out.println(c); // 12 

       System.out.println("Conf behaviour in expression");
       int num1= 11;
       System.out.println(num1++ + num1++);//23


       //substraction
       int num2 = 12;
       System.out.println();
    }
}