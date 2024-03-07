public class u2p7 {
    public static void main(String[] a)
    {
        car c =new car();
        truck t= new truck();
        c.wheels();
        t.wheels();
    }
}

abstract class vehical
{
    abstract void wheels();
}
class car extends vehical
{
    public void  wheels()
    {
        System.out.println("Two wheels:");
    }
}
class truck extends vehical
{
    public void  wheels()
    {
        System.out.println("six wheels:");
    }
}