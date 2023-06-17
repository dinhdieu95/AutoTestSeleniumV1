package hoangyen;
import java.util.ArrayList;
import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for Pascal's triangle: ");
        int numRows = scanner.nextInt();

        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int prevRowLeft = triangle.get(i - 1).get(j - 1);
                    int prevRowRight = triangle.get(i - 1).get(j);
                    row.add(prevRowLeft + prevRowRight);
                }
            }

            triangle.add(row);
        }

        System.out.println("Pascal's triangle:");
        for (ArrayList<Integer> row : triangle) {
            for (int number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
