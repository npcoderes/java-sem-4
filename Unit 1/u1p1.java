import java.util.*;

public class u1p1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int price, rate, year;
        double intr;

        System.out.println("Calculater of interest calculation");
        ;

        System.out.print("Enter a Price:");
        price = in.nextInt();

        System.out.print("Enter a rate of interest:");
        rate = in.nextInt();

        System.out.print("Enter a number of year:");
        year = in.nextInt();

        intr = ((price * rate * year) / 100);

        System.out.println("your interest is:" + intr);

        in.close();
    }
}
