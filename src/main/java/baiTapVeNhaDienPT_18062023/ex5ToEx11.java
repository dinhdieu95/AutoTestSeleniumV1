package baiTapVeNhaDienPT_18062023;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex5ToEx11 {

    /**
     * 5, Viết chương trình nhập vào một danh sách các chuỗi và sắp xếp chúng theo thứ tự tăng dần.
     */
    public static void Ex5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số luong: ");
        int n = scanner.nextInt();

        ArrayList<String> list = new ArrayList<String>();
        System.out.println("Nhap vao gia tri: ");
        for (int i = 0; i < n; i++) {
            String input = scanner.next();
            list.add(input);
        }
        // hiển thị các phần tử của list
        System.out.println("Các phần tu trong list theo thu tu tang dan la: ");
        Collections.sort(list);
        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i) + " ");
        }

    }

    /**
     * 6, Viết chương trình nhập vào một danh sách các số nguyên và tìm số lớn nhất và số nhỏ nhất trong danh sách đó.
     */
    public static void Ex6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số luong: ");
        int n = scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Nhap vao gia tri: ");
        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            list.add(input);
        }

        int soLonNhat = list.get(0);
        int soNhoNhat = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) > soLonNhat) {
                soLonNhat = list.get(i);
            }
            if(list.get(i) < soNhoNhat) {
                soNhoNhat = list.get(i);
            }
        }

        System.out.println("So lon nhat la: " + soLonNhat);
        System.out.println("So nho nhat la: " + soNhoNhat);
    }

    /**
     * 7, Cho một danh sách các chuỗi, viết chương trình để xóa tất cả các chuỗi trùng lặp trong danh sách đó.
     */
    public static void Ex7() {
        ArrayList<String> listTrung = new ArrayList<String>();
        listTrung.add("Dien");
        listTrung.add("Dien");
        listTrung.add("Coca");
        listTrung.add("Coca 2");

        ArrayList<String> listKoTrung = new ArrayList<String>();
        for (int i = 0; i < listTrung.size(); i++) {
//            containts la kiem tra trong list ko turng co thong tin cua list trung thu i hay ko
            if(!listKoTrung.contains(listTrung.get(i))) {
//                add phan thu cua list trung thu i vao list ko trung
                listKoTrung.add(listTrung.get(i));
            }
        }
        System.out.print("Mang list sau khi xoa tat ca phan tu trung la: ");
        for (int i = 0; i < listKoTrung.size(); i++) {
            System.out.print(listKoTrung.get(i) + " - ");
        }
        
    }

    /**
     * 8, Cho một danh sách các số nguyên, viết chương trình để tính tổng các phần tử của danh sách đó
     */
    public static void Ex8() {
        ArrayList<Integer> mangSoNguyen = new ArrayList<Integer>();
        mangSoNguyen.add(1);
        mangSoNguyen.add(2);
        mangSoNguyen.add(-20);
        mangSoNguyen.add(6);

        int tong = 0;
        for (int i = 0; i < mangSoNguyen.size(); i++) {
            tong = tong + mangSoNguyen.get(i);
        }
        System.out.print("Tong gia tri cua danh sach la: " + tong);
    }

    /**
     * 9, Viết chương trình Java sử dụng vòng lặp while để tính tổng các số dương nhập từ bàn phím.
     */
    public static void Ex9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số luong: ");
        int n = scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Nhap vao gia tri: ");
        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            list.add(input);
        }

        int tong = 0;
        int j = 0;
        while (j < list.size()) {
            tong = tong + list.get(j);
            j++;
        }

        System.out.print("Tong gia tri cua danh sach la: " + tong);
    }

    public static void Ex10() {
        int numRows = 5; // Số hàng của tam giác Pascal
        // Tạo một mảng 2 chiều để lưu tam giác Pascal
        int[][] triangle = new int[numRows][];
        // Khởi tạo mỗi hàng của tam giác Pascal với số phần tử tương ứng
        for (int i = 0; i < numRows; i++) {
            triangle[i] = new int[i + 1];
        }
        // Điền giá trị cho tam giác Pascal
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                // Các phần tử ở cạnh trên và cạnh trái của tam giác bằng 1
                if (j == 0 || j == i) {
                    triangle[i][j] = 1;
                } else {
                    // Các phần tử còn lại tính bằng tổng 2 phần tử trên nó
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
            }
        }

        // In tam giác Pascal
        for (int i = 0; i < numRows; i++) {
            // Thêm khoảng trắng để tạo dạng tam giác
            for (int k = 0; k < numRows - i; k++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + "   ");
            }

            System.out.println();
        }
    }

    /**
     * 11, Viết chương trình Java sử dụng vòng lặp do-while để in ra các số chẵn từ 2 đến 100.
     */
    public static void Ex11() {
        ArrayList<Integer> listSoChan = new ArrayList<Integer>();
        int i = 0 ;
        System.out.print("KQ - Cac so chan tu 2 den 100: ");
//        do{
//            if(i % 2 == 0) {
//                // Check dieu kien neu i1 la so le thi i1 chia cho 2 có số dư = 0
//                System.out.print(" " + i);
//            }
//            // Tăng giá trị i1 lên 1 đơn vị sau mỗi lần chạy
//            i++;
//        } while (i <= 100);
        do {
            i = i + 2;
            System.out.print(i + " ");
        } while (i < 100);

    }


    public static void main(String[] args) {
        // khai báo 1 ArrayList có tên là list
        // có kiểu là String
//        Ex5();
//        Ex6();
//        Ex7();
//        Ex8();
//        Ex9();
//        Ex10();
        Ex11();
    }

}
