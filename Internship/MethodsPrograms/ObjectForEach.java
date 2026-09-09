package MethodsPrograms;

public class ObjectForEach
    {
        /// 1) No Args , No return

        void greet()
        {
            System.out.println("HI OBJECT FOR EACH");
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
            //Object 1 for each
            ObjectForEach obj1 = new ObjectForEach();
            obj1.greet();

            //Object 2 for each
            ObjectForEach obj2 = new ObjectForEach();
            obj2.printSum(10,20);

            //Object 3 for each
            ObjectForEach obj3 = new ObjectForEach();
            int c = obj3.getNumber();
            System.out.println(c);

            //object 4 for each
            ObjectForEach obj4 = new ObjectForEach();
            int num = obj4.max(20,40);
            System.out.println(num);
        }
    }
