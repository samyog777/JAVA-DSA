package dsa;
import java.util.Scanner;

public class normal_trangle_number {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows for the triangle: ");
        int rows = scan.nextInt();
//        int number = 1;
        scan.close();
        
        for (int i=1; i<=rows; i++) {
        	for (int j=1; j<=rows-i; j++) {
        		System.out.print(" ");
        	}
        	
        	for (int k=1; k<=2*i-1;k++) {
        		System.out.print(i);
        	}
        	System.out.println();
        }
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
        for (int i=1; i<=rows; i++) {
        	for (int j=1; j<=rows-i; j++) {
        		System.out.print(" ");
        	}
        	
        	for (int j=1; j<=i; j++) {
        		System.out.print(i+" ");
        	}
        	System.out.println();
        }
    }
}
//     1
//    222
//   33333
//  4444444
// 555555555
//66666666666

//      1
//     2 2
//    3 3 3
//   4 4 4 4
//  5 5 5 5 5
// 6 6 6 6 6 6
