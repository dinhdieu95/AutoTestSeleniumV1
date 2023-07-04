package hv.ntyen.b7_File_NgoaiLe.Bai1;

public class HocSinh {
    private String id, name, classs;
    private int phone;
    public HocSinh(String id, String name, String phone, String classs){
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.classs = classs;
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", classs='" + classs + '\'' +
                ", phone=" + phone +
                '}';
    }
}
