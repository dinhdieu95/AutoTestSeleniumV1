package learnjava.giaibai.b2;

import java.util.LinkedList;

public class Bai8LinkedListExample {
    public static void main(String[] args) {
        // Tạo danh sách liên kết
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Thêm phần tử vào danh sách
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);

        System.out.println("Giá trị mặc định của các phần tử trong danh sách:");

        // In giá trị mặc định của các phần tử trong danh sách
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }

}
