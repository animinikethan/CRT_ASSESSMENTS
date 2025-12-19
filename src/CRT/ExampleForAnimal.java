package CRT;

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog makes sounds");
    }
}

public class ExampleForAnimal {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
    }
}