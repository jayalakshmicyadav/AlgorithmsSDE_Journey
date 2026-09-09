package MethodsPrograms;

public class InstantsMethod
    {

        /// demo of instant method (create object and access)

        int max (int x , int y )
        {
            if (x > y)
                return x;
            else
                return y;
        }


        public static void main(String[] args)
        {
           int a = 10 , b = 20;

           InstantsMethod i = new InstantsMethod();

           int c = i.max(a,b);

           System.out.println(c);

        }
    }
