package Loops;
import java.util.*;
public class RadixAll
    {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the number:");
            String number = sc.next();

            boolean binary;
            boolean octal;
            boolean decimal;
            boolean hexadecimal;

            // ================= BINARY =================

            System.out.println("=======BINARY======");

            for(int i = 0; i <= number.length()-1; i++)
            {
                binary = true;

                char ch = number.charAt(i);

                if(ch < '0' || ch > '1')
                {
                    binary = false;
                    //break;
                }

                if(binary)
                {
                    System.out.println(ch + " Yes it is binary ");
                }
                else
                {
                    System.out.println(ch + " Not binary");
                }
            }


            // ================= OCTAL =================

            System.out.println("=======OCTAL======");

            for(int i = 0; i <= number.length()-1; i++)
            {
                octal = true;

                char ch = number.charAt(i);

                if(ch < '0' || ch > '7')
                {
                    octal = false;
                    //break;
                }

                if(octal)
                {
                    System.out.println(ch + " Yes it is octal ");
                }
                else
                {
                    System.out.println(ch + " Not octal");
                }
            }


            // ================= DECIMAL =================


            System.out.println("=======DECIMAL======");
            for(int i = 0; i <= number.length()-1; i++)
            {
                decimal = true;

                char ch = number.charAt(i);

                if(ch < '0' || ch > '9')
                {
                    decimal = false;
                    //break;
                }

                if(decimal)
                {
                    System.out.println(ch + " Yes it is decimal ");
                }
                else
                {
                    System.out.println(ch + " Not decimal");
                }
            }


            // ================= HEXADECIMAL =================
            System.out.println("=======HEXADECIMAL======");

            for(int i = 0; i <= number.length()-1; i++)
            {
                hexadecimal = true;

                char ch = number.charAt(i);

                if((ch >= '0' && ch <= '9') ||
                        (ch >= 'A' && ch <= 'F') ||
                        (ch >= 'a' && ch <= 'f'))
                {
                    hexadecimal = true;
                }
                else
                {
                    hexadecimal = false;
                    //break;
                }

                if(hexadecimal)
                {
                    System.out.println(ch + " Yes it is hexadecimal");
                }
                else
                {
                    System.out.println(ch + " Not hexadecimal");
                }
            }

        }
    }
