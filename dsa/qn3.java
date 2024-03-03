package dsa;

import java.util.Scanner;

public class qn3 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter a number to check its Prime: ");
        int num = Scan.nextInt();
        Scan.close();

        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println("The "+num+" is Prime");
        } else {
            System.out.println("The "+num+" is Not Prime");
        }
    }
}
