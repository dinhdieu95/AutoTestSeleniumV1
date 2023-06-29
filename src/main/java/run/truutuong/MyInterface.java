package run.truutuong;
public interface MyInterface {

// Khai báo các phương thức trừu tượng

//    Các phương thức này mặc định là trừu tượng (abstract) và
//    các lớp implement (triển khai) interface này phải cung cấp định nghĩa cho các phương thức này.

    void method1();

    int method2(String param);

// ...

// Khai báo các thuộc tính (fields) mặc định (public static final)

    int MAX_VALUE = 100;

    String DEFAULT_NAME = "Interface";

}

//có thể kế thừa từ nhiều interface khác bằng từ khóa extends. Interface -> interface

//Các phương thức và thuộc tính trong interface mặc định là public