package NgocThDe1;

public class Animal {
    private String name;
    private int age;
    private String origin;

    public Animal(String name, int age, String origin) {
        this.name = name;
        this.age = age;
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
