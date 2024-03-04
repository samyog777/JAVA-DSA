package dsa;

import java.util.Scanner;

public class kite {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int rows = Scan.nextInt();
        Scan.close();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=rows; i>=1; i--) {
            for (int j=1; j<=rows-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
