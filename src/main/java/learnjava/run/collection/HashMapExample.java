package learnjava.run.collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> studentScores = new HashMap<>();

        // Thêm cặp khóa-giá trị vào HashMap
        studentScores.put("Alice", 90);
        studentScores.put("Bob", 85);
        studentScores.put("Charlie", 95);

        // Truy xuất giá trị bằng khóa
        int score = studentScores.get("Bob");
        System.out.println("Điểm số của Bob là: " + score);

        System.out.println("Truoc khi xoa phan tu: ");
        print(studentScores);



        // Xóa một cặp khóa-giá trị
        studentScores.remove("Alice");

        System.out.println("Sau khi xoa phan tu: ");
        // Duyệt qua các cặp khóa-giá trị trong HashMap
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            String student = entry.getKey();
            int studentScore = entry.getValue();
            System.out.println("Điểm số của " + student + " là: " + studentScore);
        }
    }
    public static void print(Map<String, Integer> studentScores){
        // Duyệt qua các cặp khóa-giá trị trong HashMap
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            String student = entry.getKey();
            int studentScore = entry.getValue();
            System.out.println("Điểm số của " + student + " là: " + studentScore);
        }
    }
}