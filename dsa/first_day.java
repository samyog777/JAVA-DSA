package dsa;
import java.util.Scanner;

public class first_day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		Scanner Scan = new Scanner(System.in);
		
		String realname = "Samyog";
		System.out.print("Enter your name: ");
		String name = Scan.next();
		if (name.equals(realname)) {	
			System.out.println("God");
		} else {
			System.out.println("you");
		}
		Scan.close();
	}

}
