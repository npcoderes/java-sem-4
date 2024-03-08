class th1 implements Runnable
{
    public void run()
    {
        int sum=0;
        for(int i=1;i<=10;i++)
        {
            sum+=i;
        }
        System.out.println("Sum of 1 to 10 is : "+sum);
        System.out.println("Avg of 1 to 10 is : "+sum/10);

    }
}
class th2 implements Runnable
{
    public void run()
    {
        int sum=0;
        for(int i=11;i<=20;i++)
        {
            sum+=i;
        }
        System.out.println("Sum of 11 to 20 is : "+sum);
        System.out.println("Avg of 11 to 20 is : "+sum/10);

    }
}


public class u4p3 {
    public static void main(String[] args)
    {
        th1 t1 = new th1();
        th2 t2 = new th2();

        Thread a = new Thread(t1);
        Thread b = new Thread(t2);

        a.start();
        b.start();

        try  {
            a.join();
            b.join();
        } catch (Exception e) {
            
        }

        System.out.println("Task Completed : ");

        
    }
}
