package giaibai.b6;

import giaibai.b6.dto.Animal;
import giaibai.b6.dto.Cat;
import giaibai.b6.dto.Cow;
import giaibai.b6.dto.Dog;

public class Bai8 {
    public static void main(String[] args) {
        // Animal, Dog, Cat, Cow
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
        cow.makeSound();
    }
}
