package MethodsPrograms;

public class MaxOfTwoNum
    {
        static int Max(int x, int y ) // x has 10 and y has 15---> recieve data --> formal parameter
        {
            if(x>y) // 10>15 --->False hence go to else
                return x;
            else
                return y; //returns 15 goes to method max(a,b)

            ///Scope checking
           // System.out.print(a);//throws error --> a is not in this method
           // System.out.print(x);
        }


        public static void main(String[] args)
        {
            int a = 10 , b = 15; // a=10 y=15 --> Parameter passing --> send data -->Actual Parameter
            // call the method
            int c = Max(a,b);//as returns 15 to catch ot we need the int type so store it in c and print it
            System.out.println(c);
           // System.out.print(x);  --> x is not in this method

        }
    }
