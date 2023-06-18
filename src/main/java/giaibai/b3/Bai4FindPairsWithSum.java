package giaibai.b3;

public class Bai4FindPairsWithSum {

    public static void main(String[] args) {
        int[] array = {2, 4, 5, 3, 6, 8};
        int targetSum = 9;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == targetSum) {
                    System.out.println("Pair found: (" + array[i] + ", " + array[j] + ")");
                }
            }
        }
    }
}
