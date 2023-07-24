package run.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eva");
        names.add("Alice");

        System.out.println("Các tên được sắp xếp theo thứ tự tăng dần:");
        for (String name : names) {
            System.out.println(name);
        }
    }

}
