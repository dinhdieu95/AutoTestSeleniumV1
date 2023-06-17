package hv.ntyen.b3;

//Viết chương trình nhập vào một mảng các số nguyên và sắp xếp chúng theo thứ tự giảm dần.
public class Bai1 {
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
        System.out.println("mang duoc sap xep theo thu tu giam dan la: ");
        for (int x: num){
            System.out.println(x);
        }

    }


}
