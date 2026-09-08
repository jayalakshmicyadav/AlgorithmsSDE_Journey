package Loops;

public class ForLoops
    {

        public static void main(String[] args)
        {
    /*
    // without increment OR infinite loop
    for(int index = 1; index <= 5; )
      {
        System.out.println("Algo");
      }
*/
/*
// step farward by 1
     for(int index = 1; index <= 5; index++)
      {
        System.out.println(index);
      }

*/
/*     //Step farward by two

    for(int index = 1; index <= 10; index+=2)  //index = index + 2
      {
        System.out.println(index);  // 1,3,5,7,9
      }
*/
/*       //step farward by two - even number
      for(int index = 2; index <= 10; index+=2)  //index = index + 2
      {
        System.out.println(index);
      }

*/
/*    //step backward by 1
     for(int index = 10; index >= 5; index--)
      {
        System.out.println(index);
      }
 */
/*       //step backward by 2
      for(int index = 10; index >= 2; index-=2)
      {
        System.out.println(index);
      }
*/

/*  //start from 0
      for(int index = 0; index <= 6; index++)
      {
        System.out.println(index);
      }
*/
/*     //start from negative numbers
    for(int index = -6; index <= -2; index++)
      {
        System.out.println(index);
      }
*/

/*     // characters
    for(char ch = 'A'; ch <= 'z'; ch++)
      {
        System.out.println(ch);
      }
*/

/*     //floating point
    //for(float index = 1; index <= 10; index++)  // we can use float also double also
    for(double index = 1; index <= 10; index++)
      {
        System.out.println(index);
      }
*/

            // beginner mistake
            // for(int i=5;i<1; i++);
            //for(int i=5,i<1,i++)
            //for(int i=1;i=5; i++)
            // wrong update : for(int i=5;i<1; i++)


            //what if no initization,condition,updation
            for( ;  ; )    // infinitely it will run
            {
                System.out.println("index");
            }

        }
    }
