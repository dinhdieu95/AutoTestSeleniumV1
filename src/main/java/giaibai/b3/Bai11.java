package giaibai.b3;

import java.util.ArrayList;
import java.util.Scanner;

// Viết chương trình Java sử dụng vòng lặp do-while để in ra các số chẵn từ 2 đến 100.
public class Bai11 {
    public static void main(String[] args) {
        int number = 2;
        int arr[] = new int[50];
        System.out.println("Mảng chứa các số chẵn từ 2 đến 100:");
        //       for (int i = 0; i < 50; i++) {
        do {
            for (int i = 0; i < 50; i++){
                arr[i] = number;// mum = 2 + 2  = 4 , lần num =  4 + 2 = 6 -> lần n:  num = 102
                number += 2;
            }
        } while (number <= 100);

      for (int i =0; i <50; i++){
          System.out.println(arr[i]);
      }
    }
}