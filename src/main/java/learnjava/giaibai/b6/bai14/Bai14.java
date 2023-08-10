package learnjava.giaibai.b6.bai14;

public class Bai14 {
    public static void main(String[] args) {
        ImmutablePerson person = new ImmutablePerson("John", 30);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Khi bạn cố gắng thay đổi giá trị của thuộc tính, sẽ xảy ra lỗi biên dịch
        // person.name = "Jane"; // Lỗi: The final field ImmutablePerson.name cannot be assigned
        // person.age = 35; // Lỗi: The final field ImmutablePerson.age cannot be assigned

    }
}
