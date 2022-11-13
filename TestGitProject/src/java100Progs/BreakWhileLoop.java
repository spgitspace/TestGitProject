/*21. While loop using break Program in java*/

package java100Progs;

import java.util.Scanner;

public class BreakWhileLoop {

	public static void main(String[] args) {
		int n;

		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.println("Enter a number to reverse : ");
			n = in.nextInt();

			if (n == 0) {
				break;
			}
			System.out.println("You entered : " + n);
		}
		in.close();
	}
}
