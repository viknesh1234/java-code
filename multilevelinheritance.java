// Multilevel Inheritance Example in Java
// This program demonstrates multilevel inheritance in Java.

// Base class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Derived class from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Derived class from Dog (multilevel inheritance)
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}

// Separate derived class from Animal (not in multilevel chain)
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

// Main class
public class multilevelinheritance
{
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat();   // Inherited from Animal
        puppy.bark();  // Inherited from Dog
        puppy.weep();  // Own method
    }
}
