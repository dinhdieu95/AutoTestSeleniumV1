package giaibai.b3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

//Cho một danh sách các chuỗi, viết chương trình để xóa tất cả các chuỗi trùng lặp trong danh sách đó.
public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong của mang: ");
        int n = scanner.nextInt();
        String  arr[]= new String[n];
        for (int i = 0 ; i < n ; i++){
            System.out.println("Nhap phan tu thu " + i);
            arr[i] = scanner.next();
        }
        String brr[] = new String[n];// khai báo mảng brr để chứa phần tử sau khi loại phần tử lặp
        int bsize = 0; //đếm các phần tử của mảng brr
        boolean isExist = false; // biến check xem đã tồn tại trong mảng brr hay chưa
        brr[0] = arr[0]; // gán phần tử đầu tiền của mảng brr bằng phần tử đầu tiên của mảng arr
        bsize++;
        for (int i = 0 ; i < arr.length ; i++){ // Duyet lần lượt các phâần tử trong mảng arr
            isExist = false; // gán lại biến check tồn tại sau mỗi lần duyệt
            for (int j = 0; j < bsize ; j++){
                if(arr[i].compareTo(brr[j]) == 0){ // so sánh phần tử của mảng arr có trùng với brr hay không
                    isExist = true; // nếu trùng gán true
                    break; // bỏ qua không làm gì nữa, chuyển đến phần tử tiếp theo
                }
            }
            if(!isExist){ //Nếu phần tử mảng arr đang duyệt chưa tồn tại trong brr thì
                brr[bsize] = arr[i]; // gán phần tử chưa tồn tại vào brr
                bsize++;
            }

        }
        // in các phần tủ mảng brr
        System.out.println("mang sau khi da loai phan tu trung: ");
        for (int i = 0; i< bsize; i++){
            System.out.println(brr[i]);
        }
    }
}
// So sanh trung nhau voi mang so nguyen
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap so luong của mang: ");
//        int n = scanner.nextInt();
//        int arr[]= new int[n];
//        for (int i = 0 ; i < arr.length ; i++){
//            System.out.println("Nhap phan tu thu " + i);
//            arr[i] = scanner.nextInt();
//        }
//        int brr[] = new int[n];// khai báo mảng brr để chứa phần tử sau khi loại phần tử lặp
//        int bsize = 0; //đếm các phần tử của mảng brr
//        boolean isExist = false;
//        brr[0] = arr[0]; // gán phần tử đầu tiền của mảng brr bằng phần tử đầu tiên của mảng arr
//        bsize++;
//        for (int i = 0 ; i < arr.length ; i++){
//            isExist = false;
//            for (int j = 0; j < bsize ; j++){
//                if(arr[i] == brr[j]){
//                    isExist = true;
//                    break;
//                }
//            }
//            if(!isExist){
//                brr[bsize] = arr[i];
//                bsize++;
//            }
//
//        }
//        for (int i = 0; i< bsize; i++){
//            System.out.println(brr[i]);
//        }
//--------------------------------
