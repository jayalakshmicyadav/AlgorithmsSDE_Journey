import java.util.*;
class BitwiseOperator
{
    public static boid main(String[] args)
    {
        int x = 10;
        int y = 6;
        int z;
        System.out.println("And"+(x & y));
        System.out.println("OR" + (x|y));
        System.out.println("XOR" + (x^y));
        System.out.pritnln("NOT X" + (~x));
        System.out.println("NOT Y" + (~y));

        System.out.println("LEFT SHIFT");
        int a = 10;
        System.out.pritln("shift by 1" + (a << 1));
        System.out.println("Shift by 2 places" + (a << 2));
        System.out.pritnln("Shift by 3 places" + (a << 3 ));

        System.out.println("Right Shift(SIGNED RIGHT SHIFT)");
        int b = 5;
        System.out.pritln("shift by 1" + (b << 1));
        System.out.println("Shift by 2 places" + (b << 2));
        System.out.pritnln("Shift by 3 places" + (b << 3 ));


    }
}