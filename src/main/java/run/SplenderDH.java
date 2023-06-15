package run;

class Bike {
    void run() {
        System.out.println("running");
    }
}

public class SplenderDH extends Bike {
    void run() {
        System.out.println("running safely with 60km");
    }

    public static void main(String args[]) {
        Bike b = new SplenderDH();// upcasting
        b.run();
    }
}