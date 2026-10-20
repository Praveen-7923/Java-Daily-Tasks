class Student {
    String name;
    int age;
    String department;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println();
    }
}

public class Task05 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Praveen";
        s1.age = 22;
        s1.department = "IT";

        s2.name = "Arun";
        s2.age = 21;
        s2.department = "CSE";

        System.out.println("Student 1 Details:");
        s1.display();

        System.out.println("Student 2 Details:");
        s2.display();
    }
}