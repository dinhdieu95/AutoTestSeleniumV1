package dienpt.Collection;

import java.util.HashMap;
import java.util.Map;

public class BookManagement {
    private HashMap<Integer,Book> listBook = new HashMap<>();

    public void addBook(Book book){
        listBook.put(book.getId(), book);
    }
    public void removeBook(int bookId) {
        listBook.remove(2);
        System.out.println("Xoa thanh cong id = " + bookId);
    }

    public void getBookById(int bookId){
        System.out.println("Thong tin cua sach " + listBook.get(bookId));
            }

    public void getAllBooks(){
        for (Map.Entry<Integer, Book> entry : listBook.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static void main(String[] agrs){
        BookManagement bookManagement = new BookManagement();
        Book book1 = new Book(12,"Truyen tranh","ABC");
        Book book2 = new Book(1,"Truyen tranh1","ABC");
        Book book3 = new Book(2,"Truyen tranh3","ABC");
        Book book4 = new Book(3,"Truyen tranh2","ABC");

        bookManagement.addBook(book1);
        bookManagement.addBook(book2);
        bookManagement.addBook(book3);
        bookManagement.addBook(book4);

        System.out.println("Xoa 1 sach theo id:");
        bookManagement.removeBook(2);

        System.out.println("Lay thong tin sach:");
        bookManagement.getBookById(1);

        System.out.println("Danh sach book hien co");
        bookManagement.getAllBooks();
    }

}
