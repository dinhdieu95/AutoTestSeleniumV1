//7. Viết một lớp Car có các thuộc tính make, model, year, color và price. Viết phương thức displayInfo() để hiển thị thông tin của xe hơi.
package hv.ntyen.b6_DaHinh_TruuTuong;

public class Car {
    private String make, model;
    private int year;
    private double price;
    public Car(String make, String model, int year, double price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getMake() {
        return make;
    }
    public String getModel(){return model;}

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setMake(String make) {
        this.make = make;
    }
    public  void setModel(String model){this.model = model;}

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}