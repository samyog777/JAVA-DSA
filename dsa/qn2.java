package dsa;

import java.util.Scanner;

//      ******
//     ******
//    ******
//   ******
//  ******
// ******

public class qn2 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Rows: ");
        int rows = Scan.nextInt();
        Scan.close();

        for (int i = 1; i <= rows; i++) {
            for (int j = rows - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
