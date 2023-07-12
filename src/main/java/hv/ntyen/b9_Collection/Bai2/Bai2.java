package hv.ntyen.b9_Collection.Bai2;

import java.util.Map;

public class Bai2 {
    public static void main(String[] args) {
        Book book1 = new Book(1,"English", "Camb");
        Book book2 = new Book(2,"Math", "Van Thiem");
        BookManagement bookManagement = new BookManagement();
        bookManagement.addBook(book1);
        bookManagement.addBook(book2);
        Book bookById = bookManagement.getBookById(2);
        System.out.println("Thông tin sách có ID = 2 là: ");
        System.out.println("Id: " +bookById.getId() + ", Title: " +bookById.getTitle() + ", Author: " +bookById.getAuthor());
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Danh sách book: ");
        Map<Integer, Book> bookMap = bookManagement.getAllBooks();
        for (Book book:bookMap.values()){
            System.out.println("Id: " +book.getId() + ", Title: " +book.getTitle() + ", Author: " +book.getAuthor());
        }
        bookManagement.removeBook(2);
    }
}
