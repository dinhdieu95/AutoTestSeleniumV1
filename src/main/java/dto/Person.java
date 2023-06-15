package dto;

public class Person {
    // khai báo các thuộc tính của đối tượng là private
    private String cmnd;
    private String hoTen;

    // tạo các phương thức getter/setter
    // 2 phương thức getCmnd() và getHoTen() là phương thức getter
    // dùng để trả về số chứng minh nhân dân và họ tên của đối tượng
    // và kiểu trả về của hai phương thức này tương ứng với kiểu dữ liệu của thuộc tính
    // 2 phương thức setCmnd() và setHoTen() là phương thức setter
    // dùng để gán giá trị cho thuộc tính chứng minh nhân dân và họ tên của đối tượng
    // trong đó tham số truyền vào của 2 phương thức này được gọi là tham số (biến cục bộ)
    // và có kiểu dữ liệu tương ứng với kiểu dữ liệu của thuộc tính (biến đối tượng)
    public String getCmnd() {
        return cmnd;
    }

    // this là từ khóa có ý nghĩa là một tham chiếu đặc biệt
    // chiếu tới đối tượng chủ của phương thức hiện hành
    // this có thể được dùng để truy cập biến đối tượng (instance variable)
    // hoặc gọi phương thức đối với đối tượng hiện hành.
    // Thông thường, công dụng này của this chỉ có ích
    // khi tên biến đối tượng bị trùng với tham số (biến cục bộ - local variable) của phương thức
    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
}
