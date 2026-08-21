abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("Vehicle has stopped.");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car engine starts with a key.");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike engine starts with a kick.");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.stop();

        Vehicle bike = new Bike();
        bike.start();
        bike.stop();
    }
}
