class CalculatorOverload {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Task03 {
    public static void main(String[] args) {
        CalculatorOverload c = new CalculatorOverload();

        System.out.println("Two integers: " + c.add(10, 20));
        System.out.println("Three integers: " + c.add(10, 20, 30));
        System.out.println("Two decimal numbers: " + c.add(5.5, 4.5));
    }
}