class th extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            try{

                System.out.println("Th X:");
                Thread.sleep(500);
            }catch(InterruptedException e){}
            

        }
    }
}

public class u4p2 {
    public static void main(String[] args)
    {
        th[] t = new th[5];

        for(int i=0;i<5;i++)
        {
            t[i]=new th();
            t[i].start();
        }
        for(int i=0;i<5;i++)
        {
            try{
                t[i].join();
            }catch(InterruptedException e){}
        }
        System.out.println("Hello : ");
    }
    
}
