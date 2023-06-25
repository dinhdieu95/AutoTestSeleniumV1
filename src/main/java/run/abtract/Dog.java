package run.abtract;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super("");
    }

    public void setName(String name){
        super.setName(name);
    }
    @Override
    public void makeSound() {
        System.out.println(super.getName() + " barks");
    }
}
