

public class u2p4 {
    public static void main(String[] args)
    {
        int a[]={3000,300,2000,500};
        String[] b={"xyz","abc","wer","ert"};
        
       int t=a[0];
       int p=0;

       for(int i=1;i<a.length;i++)
       {
        if(t>a[i])
        {
            t=a[i];
            p=i;
        }
       }

       System.out.println("The company which quoted lowest amount is : "+b[p]);
        
    }
}
