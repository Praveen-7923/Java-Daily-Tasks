class VehicleBase {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends VehicleBase {
    @Override
    void start() {
        System.out.println("Car is starting with a key");
    }
}

public class Task04 {
    public static void main(String[] args) {
        VehicleBase v = new Car();

        v.start();
    }
}