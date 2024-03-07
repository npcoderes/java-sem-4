public class u2p9 {
    public static void main(String[] args)
    {
        rec r = new rec();
        tri t = new tri();
        r.area(12, 21);
        t.area(32, 2);
    }
    
}

abstract class calculation
{
    abstract void area(int a,int b);
}

class rec extends calculation
{
       public void area(int l,int b)
       {
        System.out.println("Area of rectangle is:"+(l*b));
       }
}

class tri extends calculation
{
       public void area(int l,int b)
       {
        System.out.println("Area of trigle is:"+(l*b/2));
       }
}
