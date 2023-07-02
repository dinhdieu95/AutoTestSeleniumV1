package run.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<Integer, String> employeeNames = new TreeMap<>();

        // Thêm cặp khóa-giá trị vào TreeMap
        employeeNames.put(1001, "Alice");
        employeeNames.put(1002, "Bob");
        employeeNames.put(1003, "Charlie");

        // Truy xuất giá trị bằng khóa
        String name = employeeNames.get(1002);
        System.out.println("Tên nhân viên có mã 1002 là: " + name);

        // Xóa một cặp khóa-giá trị
        employeeNames.remove(1001);

        // Duyệt qua các cặp khóa-giá trị trong TreeMap
        for (Map.Entry<Integer, String> entry : employeeNames.entrySet()) {
            int employeeId = entry.getKey();
            String employeeName = entry.getValue();
            System.out.println("Tên nhân viên có mã " + employeeId + " là: " + employeeName);
        }
    }
}
