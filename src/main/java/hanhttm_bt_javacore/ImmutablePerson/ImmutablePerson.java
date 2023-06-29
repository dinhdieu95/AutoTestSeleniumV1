package hanhttm_bt_javacore.ImmutablePerson;

public class ImmutablePerson {
    final String name="aa";
    final int age =20;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        ImmutablePerson immutablePerson = new ImmutablePerson();

        System.out.println("name:" +   immutablePerson.getName());
        System.out.println("age:" + immutablePerson.getAge());
    }
}
