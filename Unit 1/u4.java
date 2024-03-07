
// import java.util.*;
class sum extends Thread
{
    public void run()
    {
        int sum=0;
        for(int i=1;i<=10;i++)
        {
            System.out.println(sum=sum+i);
        }
    }

}

class mul extends Thread{
    public void run()
    {
        int mul=0;
        for(int i=11;i<=20;i++)
        {
            System.out.println(mul=mul*i);
        }
    }
}

public class u4 {

    public static void main(String[] args)
    {

    sum s1=new sum();
    mul m1=new mul();

    s1.start();
    m1.start();
    }

}