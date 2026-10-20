class Rectangle {
    int length;
    int width;

    int calculateArea() {
        return length * width;
    }
}

public class Task04 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        r.length = 10;
        r.width = 5;

        int area = r.calculateArea();

        System.out.println("Length: " + r.length);
        System.out.println("Width: " + r.width);
        System.out.println("Area: " + area);
    }
}