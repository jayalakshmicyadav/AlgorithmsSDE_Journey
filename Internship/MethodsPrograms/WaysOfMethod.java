package MethodsPrograms;

public class WaysOfMethod
    {
        ///STATIC METHODS

        /// 1) No Args , No return

        static void greet()
        {
            System.out.println("HI");
        }

        /// 2) Args but No return

        static void printSum(int a , int b)// a= 10; b=20
        {
            System.out.println("sum : " + (a+b)); //sum : a+b (10+20 = 30) sum = 30 passes to method printSum();
        }

        /// 3) No Args But return

        static int getNumber()
        {
            return 100;
        }

        /// 4) Args and return

        static int max(int x , int y)
        {
            if(x>y)
                return x;
            else
                return y;
        }

        public static void main(String[] args)
        {
            /// 1)
             greet(); //--> prints HI

            /// 2)
            printSum(10,20);//--> prints 10 20

            /// 3)
            int num =  getNumber();
            System.out.println("Needs the num to be stored value : " + num);

            /// 4)
            int Largest = max(25,40);
            System.out.println("Needs the Largest to be stored value : " + Largest);
        }
    }
