package dsa;

import java.util.Scanner;

public class qn6 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int rows = Scan.nextInt();
        Scan.close();

        for (int i = 1; i <= rows; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for (int j=1; j<=2*(rows-i); j++) {
                System.out.print(" ");
            }
            for (int j=i; j>=1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=rows; i>=1; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for (int j=1; j<=2*(rows-i); j++) {
                System.out.print(" ");
            }
            for (int j=i; j>=1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
