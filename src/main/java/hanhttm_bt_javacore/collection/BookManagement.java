package hanhttm_bt_javacore.collection;

import java.util.HashMap;
import java.util.Map;

public class BookManagement {
    private Map<Integer,Book> bookMap;
    public BookManagement() {
        bookMap = new HashMap<>();
    }
    public void addBook(Book book){
        bookMap.put(book.getId(), book);
    }
    public void removeBook(int bookId){
        bookMap.remove(bookId);
    }
    public Book getBookById(int bookId){
        return bookMap.get(bookId);
    }
    public Map<Integer,Book> getAllBooks(){
        return bookMap;
    }
    public void printBookList(Book book){
        System.out.println("id: " + book.getId()+ "\tTitle: " + book.getTitle() +"\tAuthor: " + book.getAuthor());
    }
}
