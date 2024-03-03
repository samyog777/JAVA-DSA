package dsa;
import java.util.Scanner;

// *******
// ******
// *****
// ****
// ***
// **
// *

public class trangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		
		// Creating reverse Trangle
		System.out.print("Rows: ");
		int rows = Scan.nextInt();
		
		for (int i =0; i<=rows;i++) {
			for (int j =0;j<=rows-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// Creating normal trangle
		System.out.print("Row: ");
		int row = Scan.nextInt();
		
		for(int i =0; i<=row; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		Scan.close();
	}

}
