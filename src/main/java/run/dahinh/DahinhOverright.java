package run.dahinh;

import run.dahinh.dto.Animal;
import run.dahinh.dto.Cat;
import run.dahinh.dto.Dog;

public class DahinhOverright {
    public static void main(String[] args) {

        Animal animal = new Animal();

        animal.makeSound(); // Output: Animal makes a sound

        Dog dog = new Dog();

        dog.makeSound(); // Output: Dog barks

        Cat cat = new Cat();

        cat.makeSound(); // Output: Cat meows
    }


}
