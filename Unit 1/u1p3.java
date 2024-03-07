import java.util.*;

public class u1p3 {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int price;
        int code;
        double tax = 0;
        double bill;

        System.out.println("*********MAIN MENU*********");
        System.out.println("Code 1 for seat covers:");
        System.out.println("Code 2 fokr steering wheel cover:");
        System.out.println("Code 3 for car lighting:");
        System.out.println("Code 4 for air purifiere");
        System.out.println("Code 5 for othe items");

        System.out.print("Enter a code:");
        code = s1.nextInt();

        System.out.print("Enter a product price:");
        price = s1.nextInt();

        switch (code) {
            case 1:
                tax = 0.2;
                break;
            case 2:
                tax = 0.3;
                break;
            case 3:
                tax = 0.4;
                break;
            case 4:
                tax = 0.25;
                break;
            case 5:
                tax = 0.12;
                break;

            default:
                System.out.println("INVALID:");
                break;
        }

        bill = price + (price * tax);
        System.out.println("\n\n\tYOUR BILL:");
        System.out.println("Product code:" + code);
        System.out.println("Product price:" + price);
        System.out.println("Product tax:" + (tax*100)+"%");
        System.out.println("Product Bill:" + bill);

        s1.close();
    }

}
