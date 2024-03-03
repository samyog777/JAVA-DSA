package dsa;
import java.util.Scanner;

public class Even_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Scan = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int number = Scan.nextInt();
		Scan.close();
		
		for (int i=1; i<=number; i++) {
			if (i%2 == 0) {
				System.out.println(i);
			}
		}
	}

}
