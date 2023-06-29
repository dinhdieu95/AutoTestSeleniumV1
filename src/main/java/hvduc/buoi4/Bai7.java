package hvduc.buoi4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bai7 {
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
        removeDuplicateParam();
    }
    public static void removeDuplicateParam(){
        List<String> distincList = new ArrayList<String>();
        for (String param:arrayList){
                if (!distincList.contains(param)){
                    distincList.add(param);
                }
            }
        System.out.println("Kết quả sau khi loại bỏ các giá trị trùng lặp: "+distincList);
        }
}
