import java.util.Scanner;

public class Task02 {

    static void displayName(String name) {
        System.out.println("Welcome, " + name + "!");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        displayName(name);

        sc.close();
    }
}