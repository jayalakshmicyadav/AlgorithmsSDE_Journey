public class Swap3Num {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;

        int temp = a;

        a = c;
        c = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

/* without using extra memory

public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;

        a = a + b + c;
        b = a - b - c;
        c = a - b - c;
        a = a - b - c;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
*/