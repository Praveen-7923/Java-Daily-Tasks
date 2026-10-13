import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine().trim();

        int count;

        if (text.isEmpty()) {
            count = 0;
        } else {
            String[] words = text.split("\\s+");
            count = words.length;
        }

        System.out.println("Word count = " + count);

        sc.close();
    }
}