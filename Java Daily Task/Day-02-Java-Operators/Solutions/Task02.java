import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter price of Product 1: ");
        double price1 = sc.nextDouble();

        System.out.print("Enter quantity of Product 1: ");
        int quantity1 = sc.nextInt();

        System.out.print("Enter price of Product 2: ");
        double price2 = sc.nextDouble();

        System.out.print("Enter quantity of Product 2: ");
        int quantity2 = sc.nextInt();

        System.out.print("Enter price of Product 3: ");
        double price3 = sc.nextDouble();

        System.out.print("Enter quantity of Product 3: ");
        int quantity3 = sc.nextInt();

        double total1 = price1 * quantity1;
        double total2 = price2 * quantity2;
        double total3 = price3 * quantity3;

        double totalBill = total1 + total2 + total3;

        System.out.println("\n----- Shopping Bill -----");

        System.out.println("Product 1 = ₹" + total1);
        System.out.println("Product 2 = ₹" + total2);
        System.out.println("Product 3 = ₹" + total3);

        System.out.println("Total Bill = ₹" + totalBill);

        sc.close();
    }
}