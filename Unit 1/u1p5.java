import java.util.*;  // for scanner class
public class u1p5 {
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);   // command line can be used
        System.out.print("Enter a value of side x:");
        double x = s1.nextDouble();
        System.out.print("Enter a value of side y:");
        double y = s1.nextDouble();
        double area=calcarea(x,y);

        System.out.println("hypotensue of tringle is:"+area);
        s1.close();

    }
    public static double calcarea(double x,double y)
    {
        return Math.sqrt(x*x+y*y);
    }

}
