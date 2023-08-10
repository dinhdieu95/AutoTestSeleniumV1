package learnjava.giaibai.b3;

import java.util.Arrays;

public class Bai2C1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] squaredArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            squaredArray[i] = array[i] * array[i];
        }
        System.out.println(Arrays.toString(squaredArray));
    }
}
