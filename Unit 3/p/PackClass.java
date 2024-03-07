package p;
public class PackClass
{
    public void max(int a,int b,int c)
    {
        int max=(a>b && a>c?a:(b>c)?b:c);
        System.out.println("Max num is : "+max);
    }
}