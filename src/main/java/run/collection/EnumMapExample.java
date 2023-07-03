package run.collection;


import java.util.EnumMap;
import java.util.Map;

//enum Day {
//    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
//}

public class EnumMapExample {
    public static void main(String[] args) {
        // Tạo một EnumMap để lưu trữ số lượng người dùng theo ngày trong tuần
        Map<Day, Integer> userCountMap = new EnumMap<>(Day.class);

        // Thêm số lượng người dùng vào EnumMap
        userCountMap.put(Day.MONDAY, 100);
        userCountMap.put(Day.TUESDAY, 150);
        userCountMap.put(Day.WEDNESDAY, 120);
        userCountMap.put(Day.THURSDAY, 200);
        userCountMap.put(Day.FRIDAY, 180);
        userCountMap.put(Day.SATURDAY, 250);
        userCountMap.put(Day.SUNDAY, 300);

        // In ra số lượng người dùng theo ngày trong tuần
        for (Map.Entry<Day, Integer> entry : userCountMap.entrySet()) {
            Day day = entry.getKey();
            int userCount = entry.getValue();
            System.out.println("Ngày " + day + ": " + userCount + " người dùng");
        }
    }
}
