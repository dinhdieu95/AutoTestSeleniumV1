package hvduc.buoi4;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai9 {
    static ArrayList<Integer> arrayList = new ArrayList();
    public static void main(String args[]) {
        printList();
    }
    public static void addParameter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử muốn thêm vào bảng: ");
        Integer param = sc.nextInt();
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
        sumArr();
    }

    public static void sumArr(){
        int sum = 0;
        int index = 0;
        while (index<arrayList.size()){
            sum += arrayList.get(index);
            index++;
        }
        System.out.println("Tổng các giá trị của phần tử: " + sum);
    }
}
