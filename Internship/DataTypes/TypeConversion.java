class TypeConversion {
    public static void main(String[] args) {


//Type promotion or Type conversion 0or coercion

// Golden Rules:-->
//1)byte,short and char are always promoted to int before arithmetic opreation

//2)if the oprends of differnt types,java promotes the smaller type to the widest type in the expression

//3)the result of the expression is of that promoted type


    // demo of byte to byte conversion
        byte a = 20;
        byte b = 30;
        //byte c = a+b; ---> gives error bcs a+b is int type and cannot be assigned to byte type (Wrong lossy conversion)
        byte c = (byte) (a + b); //gives usigned value bcs byte can hold only 
        System.out.println("byte + byte : " + c); 
        
    //demo of byte to char conversion
        byte s = 100;
        char t = 200;
        //char u = s+t; ---> Wrong lossy conversion
        int u = s+t; 
        System.out.println("byte + char : " + u);   

    // demo of byte to short conversion
        byte d =10;
        short e = 20;
        //byte f = d+e; Wrong lossy conversion;
        int f = d+e; // correct way to assign the sum of two bytes to an int variable
        System.out.println("byte + short : " + f);

    //demo of short to char conversion  
        short x1 = 111;
        char y1 = 222;
        int z1 = x1+y1;// ---> Wrong lossy conversion
       
        System.out.println("short + char : " + z1);

    //demo fo r short to short conversion
        short x = 100;
        short y = 200;
        //short z = x+y; ---> Wrong lossy conversion
        int z = x + y; 
        System.out.println("short + short : " + z);   
        
    // demo of char to char conversion
        char p = 'A';
        char q = 'B';
        //char r = p+q; ---> Wrong lossy conversion
        int r = p+q; 
        System.out.println("char + char : " + r);     
    
    // dmeo of int to int conversion
        int m = 100;
        int n = 400;
        //int o = m+n; ---> Wrong lossy conversion
        int o = m+n; 
        System.out.println("int + int : " + o);    

    //demo of int t0 long  conversion
        int p1 = 1000;
        long p2 = 2000;
        //int p3 = p1+p2; ---> Wrong lossy conversion
        long p3 = p1+p2; 
        System.out.println("int + long : " + p3);  

    // demo of short to int conversion
        short g = 30;
        int h = 40;
        //short i = g+h; Wrong lossy conversion;
        int i = g+h; // correct way to assign the sum of two shorts to an int variable
        System.out.println("short + int : " + i); 
        
    // demo of int to long conversion
        int j = 100;
        long k = 200;
        //int l = j+k; Wrong lossy conversion;
        long l = j+k; // correct way to assign the sum of two ints to a long variable
        System.out.println("int + long : " + l);  
        
    // demo of char to int conversion
        char c1 = 'A';
        int c2 = 200;
        //char c3 = c1+c2; Wrong lossy conversion;
        int c3 = c1+c2; // correct way to assign the sum of two chars to an int variable
        System.out.println(c3);  

    //demo of long to float conversion
        long l1 = 1000;
        float l2 = 20.5f; //
        //long l3 = l1+l2; Wrong lossy conversion;
        float l3 = l1+l2; // correct way to assign the sum of two longs to a float variable
        System.out.println(l3);    



    }
}