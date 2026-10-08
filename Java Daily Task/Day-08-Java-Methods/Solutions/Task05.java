import java.util.Scanner;

public class Task05 {

    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static double divide(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Addition = " + add(num1, num2));
        System.out.println("Subtraction = " + subtract(num1, num2));
        System.out.println("Multiplication = " + multiply(num1, num2));

        if (num2 != 0) {
            System.out.println("Division = " + divide(num1, num2));
        } else {
            System.out.println("Division is not possible by zero.");
        }

        sc.close();
    }
}