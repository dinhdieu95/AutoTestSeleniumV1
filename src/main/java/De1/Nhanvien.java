package De1;

import java.util.Date;

public class Nhanvien {
    private String name;
    private String ngaySinh;
    private String gioiTinh;
    private String maNV;
    private String cmt;
    private double luongCoBan;
    private double phucCap;

    public Nhanvien() {
        this.name = name;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.maNV = maNV;
        this.cmt = cmt;
        this.luongCoBan = luongCoBan;
        this.phucCap = phucCap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getCmt() {
        return cmt;
    }

    public void setCmt(String cmt) {
        this.cmt = cmt;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getPhucCap() {
        return phucCap;
    }

    public void setPhucCap(double phucCap) {
        this.phucCap = phucCap;
    }

    @Override
    public String toString() {
        return "Nhanvien{" +
                "name='" + name + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", maNV='" + maNV + '\'' +
                ", cmt='" + cmt + '\'' +
                ", luongCoBan=" + luongCoBan +
                ", phucCap=" + phucCap +
                '}';
    }
}
