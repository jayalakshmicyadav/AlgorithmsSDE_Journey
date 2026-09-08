package Loops;

import java.util.Scanner;

public class Radix {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter num : ");
                String num = sc.next(); //"127"==> its like wordnow should read one by one reading
                boolean octal = true;//assume the number is octal

                for (int i = 0; i <= num.length() - 1; i++) {
                   octal = true;
                    char ch = num.charAt(i);
                    if (ch < '0' || ch > '7') {
                        octal = false;
                       // break;
                    }
                     if (octal) {
                            System.out.println("yes it is octal");
                        } else {
                            System.out.println("not octal");
                        }
                    }
                }
            }
