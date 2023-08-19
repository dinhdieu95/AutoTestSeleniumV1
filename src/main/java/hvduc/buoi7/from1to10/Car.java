package hvduc.buoi7.from1to10;

public class Car {
    private String make;
    private String model;
    private int year;
    private String color;
    private double price;

    public Car(String make, String model, int year, String color, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }
    public void displayInfo(){
        System.out.println("Car: " + "make: " + make + " model: " +model + " year: " + year +" color: " + color + " price: " +price);
    }
}
