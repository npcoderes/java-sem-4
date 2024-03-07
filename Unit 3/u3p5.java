import java.util.*;

public class u3p5 {
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         int n;

         n=Integer.parseInt(args[0]);
         int[] arr = new int[n];

         for(int i=0;i<n;i++)
         {
            System.out.print("Enter a Element "+i+": ");
            arr[i]= sc.nextInt();
         }
         Arrays.sort(arr);
         System.out.println("min:"+arr[0]);
         System.out.println("smin:"+arr[1]);
         sc.close();
    }
}
