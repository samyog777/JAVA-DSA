package dsa;
import java.util.Scanner;

// 123456
// 12345
// 1234
// 123
// 12
// 1

public class Reverse_number_trangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		System.out.println("Rows: ");
		
		int rows = Scan.nextInt();
		
		for (int i=rows; i>=1 ;i--) {
			for (int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		Scan.close();
	}

}
