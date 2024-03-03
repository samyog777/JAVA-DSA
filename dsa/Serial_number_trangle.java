package dsa;
import java.util.Scanner;

// 1
// 23
// 456
// 78910

public class Serial_number_trangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		
		System.out.print("Rows: ");
		int rows = Scan.nextInt();
		Scan.close();
		
		int number = 1;
		
		for (int i=1; i<=rows; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(number);
				number++;
			}
			System.out.println();
		}
	}

}
