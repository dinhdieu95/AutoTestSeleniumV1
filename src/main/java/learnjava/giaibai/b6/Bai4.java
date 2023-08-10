package learnjava.giaibai.b6;

import learnjava.giaibai.b6.dto.Circle;

public class Bai4 {
    public static void main(String[] args) {
        // Circle
        Circle circle = new Circle(5.0);
        double circleArea = circle.getArea();
        System.out.println("Area of the circle: " + circleArea);
    }
}
