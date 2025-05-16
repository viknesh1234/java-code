import java.util.*;

class vechile{
    String brand;
    int year;

    void startengine(){
        System.out.println("engine started");
    }
}

class car extends vechile{
    String fueltype;
    void startengine(){
        System.out.println(" car engine started");
    }

    void drive(){
        System.out.println("car is driving");
    }
}
class truck extends vechile{
    String loadcapacity;
     void startengine(){
        System.out.println(" truck engine started");
    }

    void haul(){
        System.out.println("truck is hauling");
    }
}
public class parcticeInheritance2 {
    public static void main(String[] args) {
        car c1 = new car();
        c1.brand = "Toyota";
        c1.year = 2022;
        c1.fueltype = "Petrol";
        c1.startengine();  // Call overridden method
        c1.drive();  // Call car-specific method

        truck t1 = new truck();
        t1.brand = "Ford";
        t1.year = 2021;
        t1.loadcapacity = "10 tons";
        t1.startengine();  // Call overridden method
        t1.haul();  // Call truck-specific method
        // You can also create an array of vechile objects
    }
}
