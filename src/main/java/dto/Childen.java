package dto;

public class Childen  extends Person{
    @Override
    public String getCmnd() {
        return super.getCmnd();
    }

    @Override
    public void setCmnd(String cmnd) {
        super.setCmnd(cmnd);
    }

    @Override
    public String getHoTen() {
        return super.getHoTen();
    }

    @Override
    public void setHoTen(String hoTen) {
        super.setHoTen(hoTen);
    }

    @Override
    public String getTest() {
        return super.getTest();
    }
//
//    @Override
//    public String getTest_protect() {
//        return super.getTest_protect();
//    }

    @Override
    public String getMieng() {
        return super.getMieng();
    }

    @Override
    public String getChan() {
        return super.getChan();
    }

    @Override
    public void an() {
        super.an();
    }

    @Override
    public boolean run() {
        return super.run();
    }

    @Override
    public boolean run(Person dieu) {
        return super.run(dieu);
    }

    public Childen(String cmnd) {
        super(cmnd);
    }

    public Childen() {
        super();
    }

    public Childen(String cmnd, String hoTen, String mieng) {
        super(cmnd, hoTen, mieng);
    }
    public void checkProtected(){
        System.out.println(this.test_protect);
    }
}
