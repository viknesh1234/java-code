// Base class
class Animal {
    String name;
    int age;

    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

// Derived class: Dog
class Dog extends Animal {
    String breed;

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }

    void fetch() {
        System.out.println("Dog is fetching");
    }
}

// Derived class: Cat
class Cat extends Animal {
    String color;

    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }

    void climb() {
        System.out.println("Cat is climbing");
    }
}

// Main class
public class PracticeInheritance {
    public static void main(String[] args) {
        // Dog object
        Dog d1 = new Dog();
        d1.name = "Tommy";
        d1.age = 5;
        d1.breed = "Kotlin";
        d1.fetch();
        d1.makeSound();  // Call overridden method

        // Cat object
        Cat c1 = new Cat();
        c1.name = "Meow";
        c1.age = 6;
        c1.color = "Black";
        c1.climb();
        c1.makeSound();  // Call overridden method
    }
}
