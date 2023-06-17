package baiTapVeNhaDienPT_18062023;

import java.util.Scanner;

public class ex1ToEx4 {
    public static void Ex2() {
        int[] soNguyenTangDan = {34, 44, 66, 67, 68};
        System.out.println("Kết quả sau binh phuong gia tri trong mang : ");
        for (int i = 0; i < soNguyenTangDan.length; i++) {
            soNguyenTangDan[i] = soNguyenTangDan[i] * soNguyenTangDan[i];
            System.out.print(soNguyenTangDan[i] + "\t");

        }
        System.out.println("----------------------------");

    }

    public static void Ex1 () {
        Scanner input = new Scanner(System.in);
        System.out.print("\n Nhập vào số lượng phần tử của mảng:");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.print("Nhập vào các phần tử trong mảng:");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        sortDesc(array);
        System.out.println("Kết quả sau khi sắp xếp theo thứ tự giảm dần là: ");
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
          }

    }

        /**
         * Sort array descending
         * @param arr: m
         */
        public static void sortDesc(int [] arr) {
            int temp = arr[0];
            for (int i = 0 ; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] < arr[j]) {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }

        public static void Ex3(){
            int [] mang3 ={3, 1, 54,62,13,67,77};
            int soLonNhat = mang3[0];
            for (int i = 0; i < mang3.length; i++) {
                if (mang3[i]>soLonNhat){
                    soLonNhat = mang3[i];//gan gia tri soLonNhat
                }
            }
            System.out.print("So lon nhat trong mang :" + soLonNhat);
        }

        public static void main (String[]args){
//            Ex1();
//            Ex2();
            Ex3();
        }
    }
