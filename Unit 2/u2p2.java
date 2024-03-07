// import java.io.Console;
// import java.util.Arrays;
import java.util.*;

public class u2p2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int len=5;
        int[] arr = new int[len];
        for(int i=0;i<len;i++)
        {
            System.out.print("Enter a no "+(i+1)+": ");
            arr[i]=sc.nextInt();
        }
        
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
