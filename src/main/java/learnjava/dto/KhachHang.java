package learnjava.dto;

public class KhachHang {
    private String ten;
    private Integer tuoi;

    public KhachHang(String ten, Integer tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "Ten: " + ten + " và tuoi " + tuoi;
    }
}
