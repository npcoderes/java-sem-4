public class u1p4 {
    public static void main(String[] args)
    {
        int a,b,c,max;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        c=Integer.parseInt(args[2]);

        max=(a>b &&a>c)?a:(b>c)?b:c;

        System.out.println("Max value is:"+max);
    }
    
}
