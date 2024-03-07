import java.util.*;
public class u1p6 {
    public static void main(String[] args)
    {
        double l,h,s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the rectangle:");
        l=sc.nextDouble();
        System.out.print("Enter height of the rectangle:");
        h=sc.nextDouble();
        System.out.print("Enter a length of squre :");
        s=sc.nextDouble();

        area(l,h);
        area(s);
        sc.close();

    }
    private static void area(double a,double b)
    {
        System.out.println("Area of rectangle is :"+a*b);
    }
    private static void area(double a)
    {
        System.out.println("Area os Square is :"+a*a);
    }
}
