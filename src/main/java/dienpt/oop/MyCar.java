package dienpt.oop;

public class MyCar {
    private String nameCar;
    private String modelCar;
    private String colorCar;
    private double priceCar;
    private int year;

    public MyCar() {
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public double getPriceCar() {
        return priceCar;
    }

    public void setPriceCar(double priceCar) {
        this.priceCar = priceCar;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    private void dispPlayInfo(){
        System.out.println("Thong tin xe cua toi dang so huu" + this.nameCar);
        System.out.println("Thong tin xe cua toi dang so huu" + this.modelCar);
        System.out.println("Thong tin xe cua toi dang so huu" + this.colorCar);
        System.out.println("Thong tin xe cua toi dang so huu" + this.priceCar);
        System.out.println("Thong tin xe cua toi dang so huu" + this.year);
    }

    public static void main(String[] args) {
        MyCar myCar = new MyCar();
        myCar.setNameCar("HuynDai");
        myCar.setModelCar("Accent");
        myCar.setColorCar("Trang Xanh Vang");
        myCar.setPriceCar(123456789);
        myCar.setYear(2022);
        myCar.dispPlayInfo();
    }
}
