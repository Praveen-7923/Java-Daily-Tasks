import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            sum = sum + numbers[i];
        }

        double average = (double) sum / numbers.length;

        System.out.println("Total = " + sum);
        System.out.println("Average = " + average);

        sc.close();
    }
}