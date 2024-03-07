
public class u2p8 {

    public static void main(String[] a)
    {
        Result r = new Result();
        System.out.println(r.pass(55));
        System.out.println(r.division(55));
    }
    
}
interface Exam
{
    boolean pass (int m);
}
interface classify {
    String division(int a);
}

class Result implements Exam,classify
{
   public boolean pass(int m)
   {
    if(m>=35)
    {
        return true;
    }
    else
    {
        return false;
    }
   }
   public String  division(int a)
   {
       if(a>=60)
       {
        return "First";
       }
       else if(a>=50)
       {
        return "second";
       }
       else {
        return "NO Division";
       }
    
   }
}
