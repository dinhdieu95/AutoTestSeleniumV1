package hv.ntyen.b9_Collection.Bai2;

public class Book {
    private int id;
    private String title, author;
    public Book(int id, String title, String author){
        this.id = id;
        this.title = title;
        this.author = author;
    }
    public int getId(){return id;}
    public String getTitle(){return title;}
    public String getAuthor(){return author;}
    public void setId(int id){this.id = id;}
    public void setId(String title){this.title = title;}
    public void setAuthor(String author){this.author = author;}
}
