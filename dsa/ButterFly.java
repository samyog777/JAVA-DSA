package dsa;
import java.util.Scanner;

public class ButterFly {

	public static void main(String[] args) {
		// Problem:
	//	    *            *
	//		**          **
	//		***        ***
	//		****      ****
	//		*****    *****
	//		******  ******
	//		**************
	//		**************
	//		******  ******
	//		*****    *****
	//		****      ****
	//		***        ***
	//		**          **
	//		*            *
		

		Scanner Scan = new Scanner(System.in);
		System.out.print("Rows: ");
		int rows = Scan.nextInt();
		Scan.close();
		
		for (int i=1; i<=rows; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			int space = 2*(rows-i);
			
			for (int l=1; l<=space; l++) {
				System.out.print(" ");
			}
			
			for (int k=1; k<=i; k++) {
				System.out.print("*");
			}
 			System.out.println();
		}
		
		for (int i=rows; i>=1; i--) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			int space = 2*(rows-i);
			for (int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			for(int k =1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
