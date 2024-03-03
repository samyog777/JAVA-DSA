package dsa;

import java.util.Scanner;
// 1
// 12
// 123
// 1234
// 12345
// 123456

public class number_trangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);

		System.out.print("Rows: ");
		int rows = Scan.nextInt();
		Scan.close();

		// Creating trangle of number
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
