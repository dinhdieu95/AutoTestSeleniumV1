package learnjava.giaibai.collection;

import java.util.Map;

public class Bai2 {
    public static void main(String[] args) {
        BookManagement bookManagement = new BookManagement();

        // Thêm sách
        Book book1 = new Book(1, "Book 1", "Author 1");
        bookManagement.addBook(book1);

        Book book2 = new Book(2, "Book 2", "Author 2");
        bookManagement.addBook(book2);

        // Lấy thông tin sách
        Book retrievedBook = bookManagement.getBookById(1);
        System.out.println("ID: " + retrievedBook.getId() + ", Title: " + retrievedBook.getTitle() + ", Author: " + retrievedBook.getAuthor());

        // Xóa sách
        bookManagement.removeBook(2);

        // Lấy danh sách sách
        Map<Integer, Book> bookMap = bookManagement.getAllBooks();
        for (Book book : bookMap.values()) {
            System.out.println("ID: " + book.getId() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }

}
