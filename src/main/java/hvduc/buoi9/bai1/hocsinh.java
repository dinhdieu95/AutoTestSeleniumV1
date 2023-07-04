package hvduc.buoi9.bai1;

public class hocsinh {
    private int id;
    private String name;
    private String sdt;
    private final String Class;

    public hocsinh(int id, String name, String sdt, String aClass) {
        this.id = id;
        this.name = name;
        this.sdt = sdt;
        Class = aClass;
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

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "hocsinh{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sdt='" + sdt + '\'' +
                ", Class='" + Class + '\'' +
                '}';
    }
}
