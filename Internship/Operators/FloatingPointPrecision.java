public class FloatingPointPrecision {
    public static void main(String[] args) {

        double num = 8.1;

        long bits = Double.doubleToLongBits(num);

        String binary = String.format("%64s",
                Long.toBinaryString(bits)).replace(' ', '0');

        System.out.println("Number: " + num);
        System.out.println("64-bit binary: " + binary);

        System.out.println("Sign     : " + binary.substring(0, 1));
        System.out.println("Exponent : " + binary.substring(1, 12));
        System.out.println("Mantissa : " + binary.substring(12));
    }
}