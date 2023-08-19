package Btvn_NgocTH.Time;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class Time {
    private int hour;
    private int minute;
    private int second;
    Scanner sc = new Scanner(System.in);

    public LocalTime initTime(int h, int m, int s) { //Lưu thời gian
        return LocalTime.of(h, m, s);
    }
    public void inputTime(){ // Nhập thời gian theo giờ, phút, giây
        System.out.println("Nhập giờ: ");
        hour = sc.nextInt();
        System.out.println("Nhập phút:");
        minute = sc.nextInt();
        System.out.println("Nhập giây:");
        second = sc.nextInt();
    }
    public void showTime(){ //Hiển thị thời gian mặc định
        inputTime();
        System.out.println("Thời gian mặc định: " + initTime(hour,minute,second));
    }

    public void sumTime(){ //Hiển thị tổng thời gian đã được cộng thêm
        System.out.println("Nhập số giây được công thêm: ");
        int seconds = sc.nextInt();
        System.out.println("Quy đổi thời gian mặc định thành giây và cộng với số giây vừa nhập. Kết quả là: " + convertToSecond(initTime(hour,minute,second),seconds));
    }
    public int convertToSecond(LocalTime time, int seconds){ //Quy đổi thời gian mặc định thành giây và cộng với số giây vừa nhập
        int totalsSeconds = time.toSecondOfDay();
        return totalsSeconds + seconds;
    }

    public void minusTime(){ //Khoảng cách giữa 2 mốc thời gian
        System.out.println("Nhập thời gian thứ 1: ");
        inputTime();
        LocalTime startDate = initTime(hour,minute,second);
        System.out.println("Nhập thời gian thứ 2: ");
        inputTime();
        LocalTime endDate = initTime(hour,minute,second);
        Duration duration = Duration.between(startDate, endDate);
        long minutes = duration.toMinutes(); // chuyển sang phút
        long seconds = duration.getSeconds() % 60; // giây còn lại
        long hours = minutes / 60; // giờ
        minutes = minutes % 60; // phút còn lại
        System.out.println("Thời gian thứ 1: " + startDate + "\nThời gian thứ 2: " + endDate);
        System.out.println("Khoảng cách giữa 2 mốc thời gian là " + hours + ":" + minutes + ":" + seconds);
    }
}
