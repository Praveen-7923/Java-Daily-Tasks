import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        System.out.print("Enter HRA Percentage: ");
        double hraPercentage = sc.nextDouble();

        System.out.print("Enter DA Percentage: ");
        double daPercentage = sc.nextDouble();

        double hra = basicSalary * hraPercentage / 100;

        double da = basicSalary * daPercentage / 100;

        double netSalary = basicSalary + hra + da;

        System.out.println("\n----- Salary Details -----");

        System.out.println("Basic Salary = ₹" + basicSalary);
        System.out.println("HRA          = ₹" + hra);
        System.out.println("DA           = ₹" + da);
        System.out.println("Net Salary   = ₹" + netSalary);

        sc.close();
    }
}
