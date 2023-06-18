package hvduc.buoi4;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai11 {
    static ArrayList<Integer> arrayList = new ArrayList();
    public static void main(String args[]) {
      addParameter();
    }
    public static void addParameter(){
        int i = 0;
        do {
            i += 2;
            arrayList.add(i);
        }while (i<100);
        System.out.println(arrayList);
    }
}
