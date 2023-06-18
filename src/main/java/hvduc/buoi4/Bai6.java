package hvduc.buoi4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai6 {
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
//        findMax(); //Cach 1
        //cach 2
        System.out.println("\nSố lớn nhất là: " + Collections.max(arrayList));
//        findMin(); // Cach 1
        //cach 2
        System.out.println("\nSố nhỏ nhất là: " + Collections.min(arrayList));
    }
    public static void findMax(){
        int max = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++){
            if (arrayList.get(i).compareTo(max) > 0){
                max = arrayList.get(i);
            }
        }
        System.out.println("\nSố lớn nhất là: " +max);
    }

    public static void findMin(){
        int min = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++){
            if (arrayList.get(i).compareTo(min) < 0){
                min = arrayList.get(i);
            }
        }
        System.out.println("\nSố lớn nhất là: " + min);
    }
}
