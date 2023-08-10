package learnjava.giaibai.b3;

import java.util.Arrays;

public class Bai1C1 {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 9};
        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
