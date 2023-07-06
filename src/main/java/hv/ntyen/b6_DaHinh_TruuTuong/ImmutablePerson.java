//Tạo một lớp "ImmutablePerson" biểu diễn thông tin về một người gồm các thuộc tính final là "name" và "age". Tạo các getter cho hai thuộc tính này và đảm bảo rằng các thuộc tính không thể thay đổi sau khi khởi tạo một đối tượng "ImmutablePerson".
package hv.ntyen.b6_DaHinh_TruuTuong;

public class ImmutablePerson {
    private final String name;
    private final int age;

    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
