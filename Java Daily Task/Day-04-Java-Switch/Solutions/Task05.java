import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- FOOD MENU -----");
        System.out.println("1. Burger - ₹120");
        System.out.println("2. Pizza  - ₹200");
        System.out.println("3. Sandwich - ₹100");
        System.out.println("4. French Fries - ₹80");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected Burger - ₹120");
                break;

            case 2:
                System.out.println("You selected Pizza - ₹200");
                break;

            case 3:
                System.out.println("You selected Sandwich - ₹100");
                break;

            case 4:
                System.out.println("You selected French Fries - ₹80");
                break;

            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}