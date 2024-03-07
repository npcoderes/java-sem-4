import java.util.Scanner;

class validate extends Exception
{
    validate(String s1)
    {
        System.out.println("Invalid :"+s1);
    }
}

public class u3p6 {
    public static void main(String[] a)
    {
        try (Scanner sc = new Scanner(System.in)) {
            String s1 = new String();
            System.out.print("Enter a String :");
            s1=sc.next();
            int len=s1.length();
            int num=0;
            try
            {
                if(len<5)
                {
                    throw new validate("Minimum Length is 5:");
                }
                char[] ch = s1.toCharArray();
                for(int i=0;i<ch.length;i++)
                {
                 if(Character.isDigit(ch[i]))
                 {
                    num++;
                 }
                }
                if(num==0)
                {
                    throw new validate("String contains atlist one digit:");
                }
                
            }
            catch(Exception e){}
        }
      
    }
}
