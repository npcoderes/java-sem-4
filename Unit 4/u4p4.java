class fy extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
             System.out.println("FYBCA ! ");
        }
    }
}
class sy extends Thread
{
    public void run()
    {
        for(int i=0;i<7;i++)
        {
             System.out.println("SYBCA ! ");
        }
    }
}


public class u4p4 {
    public static void main(String[] args)
    {
        fy f = new fy();
        sy s = new sy();

        f.start();
        s.start();

        try{
            f.join();
            s.join();
        }
        catch(InterruptedException e){}
        System.out.println("TYBCA ! ");
    }
    
}
