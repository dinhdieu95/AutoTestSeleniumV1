package hv.ntyen.b7_File_NgoaiLe.Bai1;

public class HocSinh {
    private int id;
    private String phone, name, classs;
    public HocSinh(int id, String name, String phone, String classs){
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.classs = classs;
    }
    public int getId(){return id;}
    public String getName(){return name;}
    public String getPhone(){return phone;}
    public String getClasss(){return classs;}
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
