package dienpt.oopDay2;
//
//1. tạo file hocsinh.txt
//        tạo 1 đối tương là học sinh: id, name, sdt, classs,
//        ghi vào file danh sách danh sách đối tượng học sinh
public class Student {

    private int id;
    private String name;
    private String phoneNumber;
    private String clazz;

    public Student() {
    }

    public Student(int id, String name, String phoneNumber, String clazz) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.clazz = clazz;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + phoneNumber + " - " + clazz;
    }
}
