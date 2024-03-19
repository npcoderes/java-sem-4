public class u3p4 {
    public static void main(String[] args)
    {
        String s1 = new String(args[0]);
        int up=0,lo=0;
        int len = s1.length();
        char [] ch= s1.toCharArray();

        for(int i=len-1;i>=0;i--)
        {
            System.out.println(ch[i]);
        }

        System.out.println("Total char is :"+ch.length);
        for(int i=0;i<ch.length;i++)
        {
            System.out.println("position ["+i+"] "+ch[i]);
        }
        for(int i=0;i<ch.length;i++)
        {
            if(Character.isUpperCase(ch[i]))
            {
                up++;
            }
            else
            {
                lo++;
            }
        }
        System.out.println("Upper : "+up);
        System.out.println("lower : "+lo);

        StringBuffer s2 = new StringBuffer(s1);
        String s3=new String(s2.reverse());

        if(s3.equals(s1))
        {
            System.out.println("Palindrom : ");

        }
        else
        {
            System.out.println("NOt palindrom : ");
        }
    }
}
