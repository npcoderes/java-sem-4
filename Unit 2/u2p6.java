import java.util.*;

class num {
    public  int[] arr = new int[5];
    Scanner sc = new Scanner(System.in);

    num()
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a Elements " + (i + 1) + " ");
            arr[i] = sc.nextInt();
        }
    }
    
 }
 
  class numMethods extends num {
    numMethods()
    {
        super();
    }
 
    public  void print() {
         System.out.print("Arr:");
         for (int i = 0; i < 5; i++) {
             System.out.print(super.arr[i] + " ");
         }
     }
 
     void sum() {
         int sum = 0;
         System.out.print("sum OF arr:");
         for (int i = 0; i < arr.length; i++) {
             sum += super.arr[i];
         }
         System.out.print(sum);
     }
 
     void avg() {
 
         int sum = 0;
         System.out.print("Avg Arr:");
         for (int i = 0; i < arr.length; i++) {
             sum += super.arr[i];
         }
         System.out.print(sum / (arr.length));
     }
 
     void max() {
         int max = arr[0];
         System.out.print(" Max in Arr:");
         for (int i = 1; i < arr.length; i++) {
             if (arr[i] >max) {
                 max = super.arr[i];
             }
         }
         System.out.print(max);
     }
 
     void min() {
         int min = arr[0];
         System.out.print(" Max in Arr:");
         for (int i = 1; i < arr.length; i++) {
             if (arr[i] < min) {
                 min = super.arr[i];
             }
         }
         System.out.print(min);
     }
 
 }
 


public class u2p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        numMethods m = new numMethods();
        int ch = 0;

        System.out.println("1.Display\n2.sum\n3.avg\n4.max\n5.min");
        ch = sc.nextInt();

        switch (ch) {
            case 1:
                m.print();
                break;
            case 2:
                m.sum();
                break;
            case 3:
                m.avg();
                break;
            case 4:
                m.max();
                break;
            case 5:
                m.min();
                break;

            default:
                System.out.println("INvalid:");

        }
        sc.close();
    }
   
}

