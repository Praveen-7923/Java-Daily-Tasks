import java.util.Scanner;

public class Task04 {

    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isEven(number)) {
            System.out.println("The number is Even.");
        } else {
            System.out.println("The number is Odd.");
        }

        sc.close();
    }
}