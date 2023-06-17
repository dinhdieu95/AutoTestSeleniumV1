package hv.ntyen.b3;
//Cho một mảng các số nguyên, viết chương trình để tìm và in ra các cặp phần tử có tổng bằng một số đã cho.
public class Bai4 {
    public static void main(String[] args) {
        int [] num = {1,4,2,3,0};
        System.out.println("Cho mang so nguyen: ");
        for (int i = 0 ; i<num.length ; i++){
            System.out.println(num[i]);
        }
        for (int i = 0; i < num.length; i++){
            int tong = num[i];
            int n = 7;
            for (int j = i + 1 ; j< num.length ; j++){
                tong = num[i]+num[j];
                if (tong == n) {
//                    System.out.println("Phan tu trong mang có tong bang " + n +" la phan tu co gia tri bang " +num[i] +" va phan tu co gia tri bang "+ num[j]);
                    System.out.println("Phan tu trong mang có tong bang " + n +" la phan tu o vi tri thu [" +i +"] va phan tu o vi tri thu ["+ j + "]");

                }

            }
//            System.out.println("Tong 2 phan tu trong mang : " + tong);
//            if (tong = n){



        }

    }


}
