package giaibai.b3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai8C2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = new ArrayList<>();

        System.out.print("Nhập số lượng số nguyên trong danh sách: ");

        int n = scanner.nextInt();

        System.out.println("Nhập các số nguyên vào danh sách:");

        for (int i = 0; i < n; i++) {

            int num = scanner.nextInt();

            numberList.add(num);

        }

        int sum = numberList.stream().mapToInt(Integer::intValue).sum();
//        numberList.stream().mapToInt(Integer::intValue).max();
//        numberList.stream().mapToInt(Integer::intValue).min();
//        numberList.stream().mapToInt(Integer::intValue).sorted();


//        numberList: Là một danh sách (List) chứa các phần tử kiểu Integer.
//.stream(): Phương thức này chuyển đổi danh sách numberList thành một luồng (Stream) các phần tử.
//.mapToInt(Integer::intValue): Phương thức này chuyển đổi từng phần tử Integer trong luồng thành các giá trị kiểu int
//                              bằng cách gọi phương thức intValue() trên từng phần tử.
//                              Điều này là cần thiết vì phương thức sum() chỉ áp dụng cho các giá trị kiểu số nguyên (int).
//.sum(): Phương thức này tính tổng các giá trị trong luồng đã chuyển đổi thành kiểu số nguyên (int). Nó trả về tổng của tất cả các phần tử trong danh sách numberList.
        System.out.println("Tổng các phần tử của danh sách: " + sum);

    }
}
