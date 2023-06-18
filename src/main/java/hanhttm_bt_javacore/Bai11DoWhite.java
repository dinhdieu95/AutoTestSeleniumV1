package hanhttm_bt_javacore;

//sử dụng vòng lặp do-while để in ra các số chẵn từ 2 đến 100.
public class Bai11DoWhite {
    public static void main(String[] args) {
        int number = 0;

        System.out.println("Các số chẵn nhỏ hơn hoặc bằng 20 là: ");
        do{
            number+=2;
            System.out.println(number);
        }
        while (number <= 98);
    }

}
