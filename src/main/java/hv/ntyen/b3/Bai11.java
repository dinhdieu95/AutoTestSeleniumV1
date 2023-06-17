package hv.ntyen.b3;
// Viết chương trình Java sử dụng vòng lặp do-while để in ra các số chẵn từ 2 đến 100.
public class Bai11 {
    public static void main(String[] args) {
        int number = 2;
        int arr[] = new int[50];
        System.out.println("Mảng chứa các số chẵn từ 2 đến 100:");
        do {
            for (int i = 0; i < 50; i++){
                arr[i] = number; // gán phần từ của mảng = so chan vừa tính được
                number += 2;
            }
        } while (number <= 100);
      for (int i =0; i <50; i++){
          System.out.println(arr[i]);
      }
    }
}