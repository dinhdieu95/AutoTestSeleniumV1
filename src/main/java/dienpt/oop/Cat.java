package dienpt.oop;

public class Cat implements Animal{

    @Override
    public void makeSound() {
        System.out.println("Meo meo");
    }

    public static void main(String[] args) {
        Cat bug = new Cat();
        bug.makeSound();
    }
}
