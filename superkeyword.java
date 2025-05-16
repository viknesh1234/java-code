import java.util.*;
class person{
    String name;
    person(String name){
        this.name = name;
    }
       
    }

class employee extends person{
    employee(String name)
    {
        super(name);
        System.out.println("Employee name: " + name);

    }
}
public class superkeyword {
    public static void main(String[] args) {
        employee e1 = new employee("John");
    }
}
