public class u2p5 {
    public static void main(String[] args)
    {
        sum s= new sum();
        avg a = new avg();
        System.out.println(  s.process(10, 20));
        System.out.println(  a.process(10, 20));
     
    }
}
interface  numbers
{
    int process(int a,int b);
}
class sum implements numbers
{
    public int process(int a,int b)
    {
        return (a+b);
    }
}
class avg implements numbers
{
    public int process(int a,int b)
    {
        return ((a+b)/2);
    }
}