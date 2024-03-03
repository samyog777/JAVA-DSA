package dsa;

import java.util.Scanner;

// *****
// *****
// *****
// *****
// *****
// *****

public class rectangle_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		System.out.print("Row: ");
		int rows = Scan.nextInt();
		System.out.println("Column: ");
		int column = Scan.nextInt();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		Scan.close();
	}

}
