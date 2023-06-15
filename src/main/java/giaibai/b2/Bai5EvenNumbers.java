package giaibai.b2;

public class Bai5EvenNumbers {
    public static void main(String[] args) {
        int number = 2;

        System.out.println("Các số chẵn từ 2 đến 100:");

        do {
            System.out.println(number);
            number += 2;
        } while (number <= 100);
    }

}
