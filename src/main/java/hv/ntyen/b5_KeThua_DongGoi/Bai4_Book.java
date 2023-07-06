//Cho trước lớp Book có các thuộc tính: title: String, author: String, price: double, year: int. Viết các getter, setter và constructor cho lớp Book.
package hv.ntyen.b5_KeThua_DongGoi;

public class Bai4_Book {
    private String title, author;
    private int year;
    private double price;
    public Bai4_Book(String title, String author, int year, double price){
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor(){return author;}

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public  void setAuthor(String author){this.author = author;}

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
