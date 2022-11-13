/* 20. Print Reverse number in java program
 * Enter a number to reverse : 1528
 * Reverse of entered number is : 8251*/

package java100Progs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		int n, rev = 0;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter a number to reverse : ");
		n = in.nextInt();

		while (n != 0) {
			rev = rev * 10;
			rev = rev + (n % 10);
			n = n / 10;
		}
		System.out.println("Reverse of entered number is : " + rev);

		in.close();
	}

}
