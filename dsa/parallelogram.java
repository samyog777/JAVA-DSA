package dsa;

import java.util.Scanner;

//       *******
//      *******
//     *******
//    *******
//   *******
//  *******

public class parallelogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		System.out.print("Rows: ");
		int rows = Scan.nextInt();
		Scan.close();

		for (int i = 0; i < rows; i++) {
			for (int j = rows; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= rows; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
