package giaibai.b2;

//import javafx.beans.property.BooleanProperty;

public class Bai7BooleanProperty {
    private boolean myBoolean;

    public void displayDefaultValue() {
        System.out.println("Giá trị mặc định của thuộc tính kiểu boolean là: " + myBoolean);
    }

    public static void main(String[] args) {
        Bai7BooleanProperty property = new Bai7BooleanProperty();
        property.displayDefaultValue();
    }

}
