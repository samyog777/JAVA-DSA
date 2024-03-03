package dsa;
import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// Problem::--> 
//		If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
//		If they enter 0 then stop.
		
		Scanner Scan = new Scanner(System.in);
		int number;
		
		do {
			System.out.print("Enter the marks: ");
			int mark = Scan.nextInt();
			if(mark >= 90) {
				System.out.println("This is Good");
			} else if(mark >= 60 && mark <= 89) {
				System.out.println("This is also good");
			} else if(mark >= 0 && mark <= 59) {
				System.out.println("This is Good as Well!");
			}
			
			System.out.print("Enter 1 to continue and 0 to stop: ");
			number = Scan.nextInt();
		} while(number == 1);
		Scan.close();
	}
}
