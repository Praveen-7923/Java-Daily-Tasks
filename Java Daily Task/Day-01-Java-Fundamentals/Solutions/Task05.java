import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Subject 1 mark: ");
        int mark1 = sc.nextInt();

        System.out.print("Enter Subject 2 mark: ");
        int mark2 = sc.nextInt();

        System.out.print("Enter Subject 3 mark: ");
        int mark3 = sc.nextInt();

        System.out.print("Enter Subject 4 mark: ");
        int mark4 = sc.nextInt();

        System.out.print("Enter Subject 5 mark: ");
        int mark5 = sc.nextInt();

        int total = mark1 + mark2 + mark3 + mark4 + mark5;

        double average = total / 5.0;

        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);

        sc.close();
    }
}