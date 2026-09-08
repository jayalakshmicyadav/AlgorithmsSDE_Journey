import java.util.*;
class AreaOfTri
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    int height,Base, Area;
    System.out.println("height of triangle: ");
    height = sc.nextInt();
    System.out.println("Base of triangle: ");
    Base = sc.nextInt();
    Area = (height*Base)/2;
    System.out.println("Area of triangle is: " + Area);
    }
}