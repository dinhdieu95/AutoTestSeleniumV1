package run;

import dto.Person;

public class TestPersonDongGoi{
    public static void main(String[] args) {
        Person person = new Person();

        // gán giá trị họ tên cho đối tượng person vừa tạo thông qua setHoTen()
        // và gán số chứng minh nhân dân thông qua setCmnd()
        person.setHoTen("Trần Thị Thảo");
        person.setCmnd("212321678");

        // truy cập đến tên của đối tượng person thông qua phương thức getHoten()
        // và số chứng minh nhân dân thông qua phương thức getCmnd()
        System.out.println("Tên: " + person.getHoTen() + ", số cmnd: " + person.getCmnd());
    }
}
