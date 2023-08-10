package learnjava.giaibai.b3;

import java.util.ArrayList;
import java.util.List;

public class Bai10C3 {
    public static void main(String[] args) {
        int numRows = 5; // Số hàng của tam giác Pascal

        List<List<Integer>> triangle = new ArrayList<>();

        // Tạo tam giác Pascal
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = i > 0 ? triangle.get(i - 1) : null;

            // Điền giá trị cho hàng hiện tại
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int sum = prevRow.get(j - 1) + prevRow.get(j);
                    row.add(sum);
                }
            }

            triangle.add(row);
        }

        // In tam giác Pascal
        for (List<Integer> row : triangle) {
            for (Integer num : row) {
                System.out.print(num + "   ");
            }
            System.out.println();
        }

    }


}
//