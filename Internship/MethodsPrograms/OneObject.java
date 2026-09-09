package MethodsPrograms;

public class OneObject
    {
        /// 1) No Args , No return

        void greet()
        {
            System.out.println("HI: One Obj For each Method");
        }

        /// 2) Args but No return

        void printSum(int a , int b)// a= 10; b=20
        {
            System.out.println("sum : " + (a+b)); //sum : a+b (10+20 = 30) sum = 30 passes to method printSum();
        }

        /// 3) No Args But return

        int getNumber()
        {
            return 100;
        }

        /// 4) Args and return

        int max(int x , int y)
        {
            if(x>y)
                return x;
            else
                return y;
        }

        public static void main(String[] args)
        {
            OneObject one = new OneObject();
            /// 1)
            one.greet();

            /// 2)
            one.printSum(10,20);

            /// 3)
            int c = one.getNumber();
            System.out.println(c);

            /// 4)
            int num = one.max(20,40);
            System.out.println(num);

        }
    }
