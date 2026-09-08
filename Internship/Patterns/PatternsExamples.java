package Patterns;
import java.util.*;
public class PatternsExamples
    {
        public static void main(String[] args)
        {
//            for( int i = 1 ;i <= 5; i++)
//            {
//               for( int j = 1; j <= 5; j++)
//               {
//                   System.out.print(i+j + " ");
//               }
//               System.out.println();
//            }

        /// for 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 ....25 in 5*5 matrix pattern
//           int count = 0;
//            for( int i = 1 ; i <= 5 ; i++)
//            {
//                for (int j = 1; j <= 5; j++)
//                {
//                  // count++;
//                    ++count;
//                    // System.out.format("%02d",+ " " count);
//                  //  System.out.print(j);
//                    System.out.print(count + " ");
//                }
//                System.out.println(" ");
//            }


            ///For 1...12...123...1234...12345

            //1
            //12
            //123
            //1234
            //12345

//            for(int i = 1; i<=5 ; i++)
//            {
//                for(int j= 1; j<=i ; j++)
//                {
//                    System.out.print(j+ " ");
//                }
//                System.out.println();
//            }

          ///For Pattern 4
            // 1
            // 2 3
            // 4 5 6
            // 7 8 9 10
            // 11 12 13 14 15

//            int count = 0;
//            for( int i = 1 ; i <= 5 ; i++)
//            {
//                for (int j = 1; j <= i; j++)
//                {
//                    ++count;
//                    // System.out.format("%02d",+ " " count);
//                    System.out.print(count + " ");
//                }
//                System.out.println(" ");
//            }

            ///for Pattern 05
            //1 2 3 4 5
            //1 2 3 4
            //1 2 3
            //1 2
            //1

            for(int i = 1; i<=5; i++)
            {
               for( int j = 1; j<=5-i+1; j++)
               {
                   System.out.print(j + " ");
                  // System.out.print(" * ");
               }
               System.out.println();
            }

            ///for Pattern 6
            // * * * * *
            // * * * *
            // * * *
            // * *
            // *

//            for( int i = 1; i<=5; i++)
//            {
//                for( int j = 1; j<= 5; j++)
//                {
//                    if( j>=i)
//                    {
//                        System.out.print("*");
//                    }
//                    else
//                    {
//                        System.out.print(" ");
//                    }
//                }
//                System.out.println();
//            }
           // System.out.println();
        }
    }
