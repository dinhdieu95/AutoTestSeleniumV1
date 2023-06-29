package dienpt.oop;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Go go");
    }

    public static void main(String[] args) {
        Dog muc = new Dog();
        muc.makeSound();
    }
}
