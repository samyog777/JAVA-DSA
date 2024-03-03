package dsa;

import java.util.Scanner;

// ******
//  ******
//   ******
//    ******
//     ******
//      ******

public class side_rectangle {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);
		System.out.print("Rows: ");
		int rows = Scan.nextInt();
		Scan.close();

		for (int i = 0; i <= rows; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(" ");
			}

			for (int j = 0; j <= rows; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
