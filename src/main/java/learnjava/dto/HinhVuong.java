package learnjava.dto;

import java.math.BigDecimal;

public class HinhVuong extends Hinh implements Khoi{
    private Double canh1 =1.5d;
    private Double canh2 = 2d;

    private Float canhFloat = 2f;
    private Integer canhInt = 2;

    public void setCanh1(Double canh1) throws NoSuchFieldException {
        this.canh1 = canh1;
        Double goc1 = super.goc;
        Double canh = Double.valueOf(canhFloat);
        BigDecimal test = BigDecimal.valueOf(goc);
        super.tinhDientichGoc();
    }

    @Override
    public void tinhDienTich() {
        System.out.println(canh1 * canh1 );

    }

    @Override
    public void veHinh() {

    }
}
