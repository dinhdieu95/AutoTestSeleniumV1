package learnjava.giaibai.b3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Bai1SortArrayDescending {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử trong mảng: ");

        int n = scanner.nextInt();

        Integer[] arr = new Integer[n];

        System.out.println("Nhập các phần tử của mảng:");

        for (int i = 0; i < n; i++) {

            arr[i] = scanner.nextInt();

        }

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println("Mảng sau khi sắp xếp theo thứ tự giảm dần:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
