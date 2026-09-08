class ExtractNum
{
    public static void main(String[] args)
    {
        int num = 782;
        int digit1 = num%10;
        num = num/10;
        int digit2 = num%10;
        num = num/10;
        int digit3 = num%10;

        System.out.println("Extracted digits are: " + digit3 + " " + digit2 + " " + digit1);
    }
}