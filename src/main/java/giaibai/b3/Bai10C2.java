package giaibai.b3;

import java.util.Scanner;

public class Bai10C2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số hàng của tam giác Pascal: ");

        int numRows = scanner.nextInt();

        int[][] triangle = new int[numRows][];

        for (int i = 0; i < numRows; i++) {

            triangle[i] = new int[i + 1];

            triangle[i][0] = 1;

            triangle[i][i] = 1;

            for (int j = 1; j < i; j++) {

                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];

            }

        }

        System.out.println("Tam giác Pascal:");

        for (int i = 0; i < numRows; i++) {

            for (int j = 0; j <= i; j++) {

                System.out.print(triangle[i][j] + " ");

            }

            System.out.println();

        }

    }
}
