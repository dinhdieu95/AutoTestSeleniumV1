//11. Xây dựng một lớp gốc có tên là Animal với phương thức makeSound(). Tạo các lớp con Dog, Cat và Cow kế thừa từ lớp Animal và override phương thức makeSound() trong từng lớp con sao cho mỗi loài động vật có tiếng kêu khác nhau. Sau đó, tạo đối tượng của mỗi lớp con và gọi phương thức makeSound() để xem kết quả
package hv.ntyen.b6_DaHinh_TruuTuong;

public abstract class Animal {
    public Animal(){

    }
    public abstract void makeSound();
}
