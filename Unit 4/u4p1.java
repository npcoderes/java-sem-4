/* Write an application that starts two thread. First thread displays even numbers
in the range specified from the command line and second thread displays odd
numbers in the same range. Each thread waits for 300 milliseconds before
displaying the next numbers. The application waits for both the thread to finish
and then displays the message Both threads completed. */
class odd extends Thread
{
    int lb,ub;
    odd(){}
    odd(int a,int b)
    {
         lb=a;
         ub=b;
    }
    public void run()
    {
        for(int i=lb;i<=ub;i++)
        {
            try{

            
            if(i%2==1)
            {
                System.out.println("Odd : "+i);
            }
            Thread.sleep(300);
        }
        catch(InterruptedException e){}
        }

    }
}
class even extends Thread
{
    int lb,ub;
    even(){}
    even(int a,int b)
    {
         lb=a;
         ub=b;
    }
    public void run()
    {
        for(int i=lb;i<=ub;i++)
        {
            try{

            
            if(i%2==0)
            {
                System.out.println("Even : "+i);
            }
            Thread.sleep(300);
        }
        catch(InterruptedException e){}
        }

    }
}

public class u4p1
{
    public static void main(String[] args)
    {
        int lb=Integer.parseInt(args[0]);
        int ub=Integer.parseInt(args[1]);

        odd o1= new odd(lb,ub);
        even e1=new even(lb, ub);
        o1.start();
        e1.start();

        try{
            o1.join();
            e1.join();

        }
        catch(InterruptedException e){}

        System.out.println("Both threds completed : ");


    }
}