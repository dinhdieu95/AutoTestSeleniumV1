package learnjava.run.collection;


import java.util.EnumSet;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumSetExample {
    public static void main(String[] args) {
        // Tạo một EnumSet chứa các ngày làm việc (MONDAY đến FRIDAY)
        EnumSet<Day> workingDays = EnumSet.range(Day.MONDAY, Day.FRIDAY);

        System.out.println("Các ngày làm việc:");
        for (Day day : workingDays) {
            System.out.println(day);
        }

        // Thêm một ngày cuối tuần (SUNDAY) vào EnumSet
        workingDays.add(Day.SUNDAY);

        System.out.println("Các ngày làm việc sau khi thêm SUNDAY:");
        for (Day day : workingDays) {
            System.out.println(day);
        }

        // Xóa một ngày trong EnumSet
        workingDays.remove(Day.WEDNESDAY);

        System.out.println("Các ngày làm việc sau khi xóa WEDNESDAY:");
        for (Day day : workingDays) {
            System.out.println(day);
        }
    }
}
