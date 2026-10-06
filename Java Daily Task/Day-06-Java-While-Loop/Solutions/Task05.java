import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 3) {

                System.out.print("Enter first number: ");
                int num1 = sc.nextInt();

                System.out.print("Enter second number: ");
                int num2 = sc.nextInt();

                if (choice == 1) {
                    System.out.println("Result = " + (num1 + num2));
                }
                else if (choice == 2) {
                    System.out.println("Result = " + (num1 - num2));
                }
                else {
                    System.out.println("Result = " + (num1 * num2));
                }

            }
            else if (choice == 4) {
                System.out.println("Calculator closed.");
            }
            else {
                System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}