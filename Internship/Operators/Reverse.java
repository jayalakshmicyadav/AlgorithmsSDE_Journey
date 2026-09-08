class Reverse
{
    public static void main(String[] args)
     {
        int n = 527;
        int rev = n%10;
        n = n/10;
        rev = rev*10 + n%10;
        n = n/10;
        rev = rev*10 + n%10;
        System.out.println("Reverse of the number is: " + rev);
     }
}