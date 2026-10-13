import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        System.out.println("Length = " + text.length());
        System.out.println("Uppercase = " + text.toUpperCase());

        sc.close();
    }
}