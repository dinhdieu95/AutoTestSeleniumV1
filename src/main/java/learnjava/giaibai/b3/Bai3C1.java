package learnjava.giaibai.b3;

public class Bai3C1 {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 9};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max number: " + max);
    }
}
