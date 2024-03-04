package dsa;

import java.util.Scanner;

public class qn5 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Rows: ");
        int rows = Scan.nextInt();
        Scan.close();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 2; j--) {
                System.out.print(j);
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
