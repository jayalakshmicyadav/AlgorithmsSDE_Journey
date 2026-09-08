class Example1
{
    public static void main(String [] args)
    {
        int a = 10;
        int b = 20;
        System.out.println("intial values before Operations: " + a + " " + b);

        //System.out.println(a + " " + b);
        //System.out.println(b);

         System.out.println("After operation :");

        // Arithematic operators
        //1) BINARY OPERATORS
        System.out.println("Addition : " + (a+b));
        System.out.println("Subtraction : " + (a-b));
        System.out.println("Multiplication : " + (a*b));
        System.out.println("Division : " + (a/b));
        System.out.println("Modulus : " + (a%b));

        //2) UNARY OPERATORS
        System.out.println("Increment : " + (++a));
        System.out.println("Post Increment : " + (a++));
        System.out.println("Decrement : " + (--b));
        System.out.println("Post Decrement : " + (b--));
        
        //3) INTEGER V/S FLOAT 
        int c = 10;     
        int d = 20;
        float e = 10.0f;
        float f = 30.0f;
        System.out.println("Integer Division : " + (c/d));
        System.out.println("Float Division : " + (e/f));
        System.out.println("Integer Float Division : " + (c/f));
        System.out.println("Float interger Division : " + (e/d));


        //4) PRECENDENCE OF OPERATORS



        //5) BOOLEAN OPERATORS
        boolean x = true ;
        boolean y = false;
        System.out.println("ADD BOOLEAN: " + (x && y));
        System.out.println("SUBTRACT BOOLEAN: " + (x || y));
        System.out.println("MULTIPLY BOOLEAN: " + (x ^ y));
        System.out.println("DIVIDE BOOLEAN: " + (!x));
        //System.out.println("MODULUS BOOLEAN: " + (x y));


    }
}
