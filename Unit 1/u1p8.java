// A shop during festival season offers a discount 10% for purchase made up to
// Rs.1,000,
// 12% for purchase value of Rs.1,000 or more up to Rs 1,500 and 15% for
// purchase value
// of Rs.1,500 or more. Write a program to implement the above scheme for a
// given sales
// and print out the sales and print out the sales value, discount and net amount
// payable by
// a customer. Create necessary methods and constructors
import java.util.*;
public class u1p8 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a;

        System.out.print("Enter a Amount:");
         a=sc.nextInt();
        calc c = new calc(a);
        c.calcIn();
        c.print();


    }
    
}
class calc
{
    double pa,net;
    double dis;
    calc(double a)
    {
        pa=a;
    }
    calc()
    {}
    public void calcIn()
    {
        if(pa<=1000)
        {
            dis=(pa*10)/100;
            net= pa-dis;
        }
        else if(pa>1000 && pa<=1500)
        {
           dis=(pa*12)/100;
           net=pa-dis;
        }
        else if(pa>1500)
        {
            dis=(pa*15)/100;
            net=pa-dis;
        }
    }
    public void print()
    {
        System.out.println("Purchase Amount:"+pa);
        System.out.println("Discount Amount:"+dis);
        System.out.println("Net Amount:"+net);
    }
}

