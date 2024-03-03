package dsa;
import java.util.Scanner;

public class isPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		System.out.print("Number: ");
		int num = Scan.nextInt();
		Scan.close();
		
		boolean isPrime = true;
		for (int i=2; i<=num/2; i++) {
			if (num%i == 0) {
				isPrime = false;
			}
		}
		
		if (isPrime) {
			System.out.println("--> The " + num + " is Prime.");
		} else {
			System.out.println("--> The "+ num + " is not Prime.");
		}
	}

}
