package ConditionalStatements;

public class Equals {
    public static void main(String[] args)
    {
        System.out.println("Scenario 1 using both strings literals :");
        String s1 = "Java";
        String s2 = "Java";

        System.out.println(s1 == s2); //true
        System.out.println(s1.equals(s2)); //true


        System.out.println("Scenario 2 of both using new ");
        String s3 = new String("Java");
        String s4 = new String("Java");

        System.out.println(s3 == s4); //false
        System.out.println(s3.equals(s4)); //true

        System.out.println("Scenario 3 literal v/s new");
        String s5 = "Java";
        String s6 = new String("Java");

        System.out.println(s5 == s6); //fasle
        System.out.println(s5.equals(s6)); //true

    }
}
