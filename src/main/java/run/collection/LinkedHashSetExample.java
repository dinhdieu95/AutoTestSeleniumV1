package run.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> colors = new LinkedHashSet<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red"); // Phần tử trùng lặp

        System.out.println("Các màu sắc theo thứ tự chèn:");
        for (String color : colors) {
            System.out.println(color);
        }
    }

}
