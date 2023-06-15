package dto;

public class MyObject {
    private int myInt;
    private boolean myBoolean;
    private String myString;
    // ... thêm các thuộc tính khác nếu cần

    // Phương thức hiển thị giá trị mặc định của các thuộc tính
    public void displayDefaultValues() {
        System.out.println("Giá trị mặc định của myInt: " + myInt);
        System.out.println("Giá trị mặc định của myBoolean: " + myBoolean);
        System.out.println("Giá trị mặc định của myString: " + myString);
        // ... in ra giá trị mặc định của các thuộc tính khác
    }

}
