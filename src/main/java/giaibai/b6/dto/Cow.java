package giaibai.b6.dto;

public class Cow
        extends Animal {
    @Override// ghi đè phương thức lớp cha => thể hiện tính đa hình
    public void makeSound() {
        System.out.println("Cow moos");
    }

}
