package learnjava.dto;

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

    private String mieng = "Mieng"; //thuộc tính
    private String chan = "2chan"; //thuộc tính
    public String test = "check_public";
    protected String test_protect = "Test_protect";

    public String getTest() {
        return test;
    }

//    public String getTest_protect() {
//        return test_protect;
//    }

    public String getMieng() {
        return mieng;
    }

    public String getChan() {
        return chan;
    }

    public void an() {// phương thức của đối tượng
        System.out.println("Ăn bằng miệng" + mieng);

    }

    public boolean run() { // run là tên phương thức
        return chan.equals("2chan") ? true : false;
    }

    public boolean run(Person dieu) { // run là tên phương thức
        String giay = "1 cai";
        return dieu.getChan().equals("2chan") ? true : false;
    }

    public Person(String cmnd) {
        this.cmnd = cmnd;
    }

    public Person() {
    }

    public Person(String cmnd, String hoTen, String mieng) {
        this.cmnd = cmnd;
        this.hoTen = hoTen;
        this.mieng = mieng;
    }

//    @Override
    public String toChuoi() {
        return "Person{" +
                "cmnd='" + cmnd + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", mieng='" + mieng + '\'' +
                ", chan='" + chan + '\'' +
                ", test='" + test + '\'' +
                ", test_protect='" + test_protect + '\'' +
                '}';
    }
}
