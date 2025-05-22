import java.util.*;

abstract class Vechile { // Abstract class
    abstract void startengine(); // Abstract method

    void stopengine() { // Concrete method
        System.out.println("Engine stopped");
    }
}

class Car extends Vechile {
    void startengine() {
        System.out.println("Car engine started");
    }
}

class Truck extends Vechile {
    void startengine() {
        System.out.println("Truck engine started");
    }
}

public class AbstractMethod {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.startengine();  // Output: Car engine started
        c1.stopengine();   // Output: Engine stopped
         Truck t1 = new Truck();
        t1.startengine();  // Output: Truck engine started
        t1.stopengine();   // Output: Engine stopped
    }
}
