package run.statictest;

public class Counter {
    private static int count; // biến static

    public Counter() {

        count++;

    }

    public static void main(String[] args) {

        Counter c1 = new Counter();

        Counter c2 = new Counter();

        Counter c3 = new Counter();

        System.out.println("Number of instances created: " + count); // Kết quả: 3

    }
}
