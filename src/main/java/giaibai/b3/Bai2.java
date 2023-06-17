package giaibai.b3;
//Cho một mảng số nguyên đã được sắp xếp theo thứ tự tăng dần. Viết chương trình để chuyển đổi mảng thành một mảng mới với tất cả các phần tử được bình phương.
public class Bai2 {
    public static void main(String[] args) {
        int [] num = {1,4,2,3,0};
        System.out.println("Cho mang so nguyen: ");
        for (int i = 0 ; i<num.length ; i++){
            System.out.println(num[i]);
        }
        for (int i = 0; i < num.length; i++){
            int max_index = num[i];
            for (int j = i + 1 ; j< num.length ; j++){
                if (num[j]< max_index) {
                    num [i] = num [j];
                    num[j] = max_index;
                    max_index = num [i];
                }

            }
        }
        System.out.println("mang duoc sap xep theo thu tu tang dan la: ");
        for (int x: num){
            System.out.println(x);
        }
        System.out.println("Binh phuong mang duoc sap xep theo thu tu tang dan la: ");
        for (int i = 0; i<num.length ; i++){
            System.out.println(+Math.pow(num[i],2));
        }


    }


}
