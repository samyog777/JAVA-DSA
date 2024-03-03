package dsa;
import java.util.Scanner;

public class trangle_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//             1
		//			  212
		//			 32123
		//			4321234
		//         543212345
		System.out.print("Rows: ");
		Scanner Scan = new Scanner(System.in);
		int rows = Scan.nextInt();
		Scan.close();
		
		for(int i=1; i<=rows; i++) {
			for (int j=1; j<=rows-i; j++) {
				System.out.print(" ");
			}
			for (int l=i; l>=2; l--) {
				System.out.print(l);
			}
			
			for (int k=1; k<=i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
