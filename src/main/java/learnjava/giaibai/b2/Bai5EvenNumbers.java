package learnjava.giaibai.b2;

public class Bai5EvenNumbers {
    public static void main(String[] args) {
        int number = 2;

        System.out.println("Các số chẵn từ 2 đến 100:");

        do {
            System.out.println(number);// lần 1  in 2  lần 2  in ra = 4
            number += 2; // mum = 2 + 2  = 4 , lần num =  4 + 2 = 6 -> lần n:  num = 102
        } while (number <= 100);

    }

}
