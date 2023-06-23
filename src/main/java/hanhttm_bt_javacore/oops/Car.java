package hanhttm_bt_javacore.oops;

//Cho trước lớp Car có các thuộc tính: make: String, model: String, year: int, price: double.
// Viết các getter, setter và constructor cho lớp Car.
public class Car {
    private String make;
    private String model;
    private int year;
    private  double price;

    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
