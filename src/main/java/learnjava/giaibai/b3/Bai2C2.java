package learnjava.giaibai.b3;

import java.util.Arrays;

public class Bai2C2 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int[] squaredArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            squaredArr[i] = arr[i] * arr[i];

        }

        System.out.println("Mảng gốc: " + Arrays.toString(arr));

        System.out.println("Mảng mới với các phần tử bình phương: " + Arrays.toString(squaredArr));

    }
}
