package hvduc.buoi4;

import java.util.*;

public class Bai5 {
    static ArrayList<String> arrayList = new ArrayList();
    public static void main(String args[]) {
        printList();
    }
    public static void addParameter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử muốn thêm vào bảng: ");
        String param = sc.nextLine();
        arrayList.add(param);
    }

    public static void printList(){
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn nhập bao nhiêu phẩn tử: ");
        size = sc.nextInt();
        for (int i = 0; i < size; i++){
            addParameter();
        }
        System.out.println("Các phần tử trong bảng: " + arrayList);
        Collections.sort(arrayList);
        System.out.println("Các phần tử trong bảng được sắp xếp từ nhỏ đến lớn: " + arrayList);
    }

}
