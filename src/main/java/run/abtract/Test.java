package run.abtract;

public class Test {
    public static void main(String[] args) {

        Animal dog = new Dog("Bobby");
        dog.makeSound();

        dog.setName("BUB");
        dog.makeSound();

    }
}
