package De1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class handle {
    Nhanvien nv = new Nhanvien();
    ArrayList<Object> arrayList = new ArrayList();
    public void nhapThongTinNhanVien(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên nhân viên: ");
        String ten = sc.nextLine();
        nv.setName(ten);
        System.out.println("Nhập ngày sinh theo định dạng dd/MM/yyyy: ");
        String ngaysinh = sc.nextLine();
        SimpleDateFormat dateFormat= new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = dateFormat.parse(ngaysinh);
            nv.setNgaySinh(ngaysinh);
        }catch (Exception e){
            System.out.println("Ngày không hợp lệ!!!");
        }
        System.out.println("Nhập giới tính: ");
        String gioiTinh = sc.nextLine();
        nv.setGioiTinh(gioiTinh);
        System.out.println("Nhập mã nhân viên: ");
        String maNV = sc.nextLine();
        nv.setMaNV(maNV);
        System.out.println("Nhập số CMT: ");
        String cmt = sc.nextLine();
        nv.setCmt(cmt);
        System.out.println("Nhập lương cơ bản: ");
        Double luongCoban = sc.nextDouble();
        nv.setLuongCoBan(luongCoban);
        System.out.println("Nhập phụ cấp: ");
        Double phuCap = sc.nextDouble();
        nv.setPhucCap(phuCap);
        arrayList.add(nv);
    }
    public void inDanhSach(){
        for (Object i : arrayList){
        System.out.println(arrayList.get((Integer) i).toString());
        }
    }
    public boolean compare(String date1, String date2) throws ParseException {
        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date d1 = sdformat.parse(date1);
            Date d2 = sdformat.parse(date2);
            if(d1.compareTo(d2) > 0) {
                return true;
            } else if(d1.compareTo(d2) < 0) {
                return false;
            } else if(d1.compareTo(d2) == 0) {
                return true;
            }
        }catch (Exception e){
            Exception exception;
        }
        return true;
    }
    public double tinhLuong(double lcb, double pc){
        return lcb*3+pc;
    }
    public void inLuongNhanVien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã nv cần tìm: ");
        String maNV = sc.nextLine();
    }

    public void menu(){
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean check = true;
        do {
            System.out.println("1. Nhập thông tin nhân viên \n" + "2. Hiển thị ra màn hình danh sách nhân viên \n" + "3. Sắp xếp danh sách nhân viên theo tuổng \n"
                    + "4. Xem lương của nhân viên theo mã \n" +  "5.Thoát \n"  + "Lựa chọn của bạn là: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    int i = 0;
                    while (i < 5){
                        nhapThongTinNhanVien();
                        i++;
                    }
                    break;
                case 2:
                    inDanhSach();
                    break;
                case 3:
//                    compare(nv.getNgaySinh(),nv.getNgaySinh());
                    break;
                case 4:
                    tinhLuong(nv.getLuongCoBan(),nv.getPhucCap());
                    break;
                case 5:
                    check = false;
                    break;
                default:
                    System.out.println("Cảm ơn bạn nha");
                    check = false;
                    break;
            }
        }while (check);
    }
    }

