package learnjava.run.vudu;

import java.util.Scanner;

public class Mang2Chieu {
    public static void main(String[] args) {
        int hang = 2;
        int cot = 3;
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[cot][hang];
        for(int j =0; j< hang ; j++){
            for (int i = 0; i< cot; i++){
                System.out.println( "Nhập giá trị a[" + i +"][" + j +"] = " );
                a[i][j] = sc.nextInt();
            }
        }
        in(a,hang, cot);
    }
    public static void  in(int a[][], int hang, int cot){
        for(int j =0; j< hang ; j++){
            for (int i = 0; i< cot; i++){
                System.out.print( a[i][j] + "\t");

            }
            System.out.println();
        }
    }
}
