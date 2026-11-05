abstract class ShapeBase {
    abstract double area();
}

class Circle extends ShapeBase {
    double radius = 5;

    @Override
    double area() {
        return 3.14 * radius * radius;
    }
}

public class Task05 {
    public static void main(String[] args) {
        Circle c = new Circle();

        System.out.println("Circle Area: " + c.area());
    }
}