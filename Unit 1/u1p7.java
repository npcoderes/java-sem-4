import java.util.*;
public class u1p7 {

    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int a,b,c,d;
   
       System.out.print("Enter a value of real 1 :");
       a=sc.nextInt();
       System.out.print("Enter a value of imag 1 :");
       b=sc.nextInt();
       System.out.print("Enter a value of real 2 :");
       c=sc.nextInt();
       System.out.print("Enter a value of Imag 2 :");
       d=sc.nextInt();

       complex c1= new complex(a,b);
       complex c2=new complex(c, d);
       complex c3= new complex();
       c3=c1.add(c1, c2);
       System.out.println("Addition of Two complex no:"+c3.real+","+c3.img);
       c3=c1.sub(c1, c2);
       System.out.println("Sub of Two complex no:"+c3.real+","+c3.img);
       c3=c1.mul(c1, c2);
       System.out.println("Mul of Two complex no:"+c3.real+","+c3.img);
    }
    
}

class complex
{
    int real,img;
    complex()
    {}
    complex(int r,int i)
    {
        real=r;
        img=i;

    }

    complex add (complex a,complex b)
    {
        complex temp =new complex();
        temp.real=a.real+b.real;
        temp.img=a.img+b.img;
        return temp;
    }
    complex mul (complex a,complex b)
    {
        complex temp =new complex();
        temp.real=a.real*b.real;
        temp.img=a.img*b.img;
        return temp;
    }
    complex sub (complex a,complex b)
    {
        complex temp =new complex();
        temp.real=a.real-b.real;
        temp.img=a.img-b.img;
        return temp;
    }
}
