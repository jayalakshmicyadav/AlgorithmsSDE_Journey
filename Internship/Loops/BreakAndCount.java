package Loops;

public class BreakAndCount
    {
        public static void main(String[] args)
        {
            for(int i = 1; i <= 10; i++)
            {
                if(i == 5)
                {
                    //break; // --> exits loop when the target is found by checking condition
                    continue; // --> will only skip the condition becomes true
                }
                System.out.println(i);
            }

        }
    }
