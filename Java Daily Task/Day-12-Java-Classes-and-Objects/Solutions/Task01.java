class Student {
    String name;
    int age;
    String department;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }
}

public class Task01 {
    public static void main(String[] args) {
        Student s = new Student();

        s.name = "Praveen";
        s.age = 22;
        s.department = "IT";

        s.display();
    }
}