package hanhttm_bt_javacore.collection;

import java.util.List;
import java.util.Map;

public class Bai2 {
    public static void main(String[] args) {
        BookManagement bookManagement = new BookManagement();
        Book book1 = new Book(1,"aaa", "aaa");
        Book book2 = new Book(5,"bbb", "bbb");
        Book book3 = new Book(3,"ccc", "ccc");
        //add book
        bookManagement.addBook(book1);
        bookManagement.addBook(book2);
        bookManagement.addBook(book3);
        //get book 1
        Book getBook = bookManagement.getBookById(1);
        getBook.printBook();;
        Map<Integer, Book> bookMap1 = bookManagement.getAllBooks();
        for(Book book:bookMap1.values()){
            book.printBook();;
        }
        // Lấy danh sách sách
        Map<Integer, Book> bookMap = bookManagement.getAllBooks();
        for (Book book : bookMap.values()) {
            System.out.println("ID: " + book.getId() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
        //xoa
        bookManagement.removeBook(1);
        Map<Integer, Book> bookMap2 = bookManagement.getAllBooks();
        for(Book book:bookMap2.values()){
            book.printBook();;
        }
    }
}
