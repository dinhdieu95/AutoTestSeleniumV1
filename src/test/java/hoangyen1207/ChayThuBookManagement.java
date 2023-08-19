package hoangyen1207;

import java.util.HashMap;
import java.util.Map;

class Book {
    private int id;
    private String title;
    private String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class BookManagement {
    private Map<Integer, Book> bookMap;

    public BookManagement() {
        bookMap = new HashMap<>();
    }

    public void addBook(Book book) {
        bookMap.put(book.getId(), book);
    }

    public void removeBook(int bookId) {
        bookMap.remove(bookId);
    }

    public Book getBookById(int bookId) {
        return bookMap.get(bookId);
    }

    public Map<Integer, Book> getAllBooks() {
        return bookMap;
    }
}

public class ChayThuBookManagement {
    public static void main(String[] args) {
        BookManagement bookManagement = new BookManagement();

        Book book1 = new Book(1, "Java Programming", "John Doe");
        bookManagement.addBook(book1);

        Book book2 = new Book(2, "Python Basics", "Jane Smith");
        bookManagement.addBook(book2);

        Book book3 = new Book(3, "C++ Essentials", "Alice Johnson");
        bookManagement.addBook(book3);

        System.out.println("Danh sách sách:");
        Map<Integer, Book> bookMap = bookManagement.getAllBooks();
        for (Map.Entry<Integer, Book> entry : bookMap.entrySet()) {
            int bookId = entry.getKey();
            Book book = entry.getValue();
            System.out.println("ID: " + bookId);
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println();
        }

        int bookIdToRemove = 2;
        bookManagement.removeBook(bookIdToRemove);
        System.out.println("Sách có ID " + bookIdToRemove + " đã được xóa.");

        System.out.println("Danh sách sách sau khi xóa:");
        bookMap = bookManagement.getAllBooks();
        for (Map.Entry<Integer, Book> entry : bookMap.entrySet()) {
            int bookId = entry.getKey();
            Book book = entry.getValue();
            System.out.println("ID: " + bookId);
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println();
        }


        int bookIdToFind = 1;
        Book foundBook = bookManagement.getBookById(bookIdToFind);
        if (foundBook != null) {
            System.out.println("Thông tin sách có ID " + bookIdToFind + ":");
            System.out.println("ID: " + foundBook.getId());
            System.out.println("Title: " + foundBook.getTitle());
            System.out.println("Author: " + foundBook.getAuthor());
            System.out.println();
        } else {
            System.out.println("Không tìm thấy sách có ID " + bookIdToFind);
        }
    }
}
