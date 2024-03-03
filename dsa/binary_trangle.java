package dsa;
import java.util.Scanner;

// 1
// 01
// 101
// 0101
public class binary_trangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		System.out.print("Rows: ");
		int rows = Scan.nextInt();
		Scan.close();
		
		for (int i=1; i<=rows; i++) {
			for (int j=1; j<=i; j++) {
				if ((i+j)%2 == 0) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
}
