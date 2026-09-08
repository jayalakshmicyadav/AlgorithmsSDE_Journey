public class Swap4Num {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        int temp = a;

        a = d;
        d = c;
        c = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

/* without using extra memory
public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        a = a + b + c + d;
        b = a - b - c - d;
        c = a - b - c - d;
        d = a - b - c - d;
        a = a - b - c - d;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
    */