import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter traffic signal (red/yellow/green): ");
        String signal = sc.next().toLowerCase();

        switch (signal) {
            case "red":
                System.out.println("Stop");
                break;

            case "yellow":
                System.out.println("Get Ready");
                break;

            case "green":
                System.out.println("Go");
                break;

            default:
                System.out.println("Invalid signal.");
        }

        sc.close();
    }
}