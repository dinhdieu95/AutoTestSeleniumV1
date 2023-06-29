package dto;

public abstract class Hinh {
    private Double canh;
    public Double goc;

    public abstract void tinhDienTich();

    public void tinhDientichGoc(){
        System.out.println( canh * goc );
    }

}
