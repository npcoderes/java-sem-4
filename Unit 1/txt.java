import java.util.*;

public class txt {
    public static void main(String[] args) {

        Scanner m = new Scanner(System.in);
        System.out.println("Hello World!");

        String[] a = new String[5];

        System.out.println("Enter 5 car names:");

        for (int i = 0; i <= a.length; i++) {
            System.out.print("Enter car " + i + ":");
            a[i] = m.nextLine();

        }
        System.out.println("This car name you Entered");
        for (String i : a) {
            System.out.println(i);
        }
        m.close();

    }
}
