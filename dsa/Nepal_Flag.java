package dsa;
import java.util.Scanner;

// *
// ***
// *****
// *******
// *********
// ***********
// *************
// ***************
// *****************
// *******************
// ***
// *****
// *******
// *********
// ***********
// *************
// ***************
// *****************
// *******************
// *********************
// ***********************
// *************************
// ***************************
// ***
// ***
// ***
// ***
// ***
// ***
// ***
// ***
// ***

public class Nepal_Flag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Scan = new Scanner(System.in);
		
		System.out.print("Rows: ");
		int rows = Scan.nextInt();
		Scan.close();
		
		for (int i=0; i<=rows; i++) {
			for(int j=0; j<=i*2; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		for (int i=1; i<=rows*1.5; i++) {
			for (int j=0; j<=i*2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=1; i<=rows; i++) {
			for (int j=1; j<=3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
