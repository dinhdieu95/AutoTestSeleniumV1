package giaibai.b3;
//Viết chương trình để tìm số lớn nhất trong một mảng số nguyên.
public class Bai3 {
    public static void main(String[] args) {
        int [] num = {1,4,2,3,0};
        System.out.println("Cho mang so nguyen: ");
        for (int i = 0 ; i<num.length ; i++){
            System.out.println(num[i]);
        }
        for (int i = 0; i < num.length; i++){
            int max_index = num[i];
            for (int j = i + 1 ; j< num.length ; j++){
                if (num[j]> max_index) {
                    num [i] = num [j];
                    num[j] = max_index;
                    max_index = num [i];
                }

            }
        }

        System.out.println("So lon nhat cua mang la : " + num[0]);

    }


}
