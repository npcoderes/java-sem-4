import java.util.Scanner;

public class u2p3 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a[][]= new int[3][3];
        int b[][]= new int[3][3];
        int c[][]= new int[3][3];

        for(int i=0;i<3;i++)
        {
           for(int j=0;j<3;j++)
           {
              System.out.print("Entter  for matrix 1 ["+i+"]"+" ["+j+"]");
              a[i][j]=sc.nextInt();
           }
        }
        for(int i=0;i<3;i++)
        {
           for(int j=0;j<3;j++)
           {
              System.out.print("Entter  for matrix 2 ["+i+"]"+" ["+j+"]");
              b[i][j]=sc.nextInt();
           }
        }

        System.out.println("Sum OF matrix a and b:");
        for(int i=0;i<3;i++)
        {
           for(int j=0;j<3;j++)
           {
              c[i][j]=a[i][j]+b[i][j];
           }
        }

        for(int i=0;i<3;i++)
        {
           for(int j=0;j<3;j++)
           {
                 System.out.print(c[i][j]+" ");
           }
           System.out.println(" ");
        }
        sc.close();



    }
}
