class Employee {
    int id;
    String name;
    double salary;

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class Task02 {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.id = 101;
        e.name = "Arun";
        e.salary = 25000.0;

        e.display();
    }
}