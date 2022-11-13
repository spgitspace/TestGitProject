/*22. While loop using break and continue Program in java*/

package java100Progs;

import java.util.Scanner;

public class BreakContinueWhileLoop {

	public static void main(String[] args) {
		
		int n;

		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.println("Input an integer");
			n = in.nextInt();
			
			if (n != 0) {
				System.out.println("You entered " + n);
				continue;
			} else {
				break;
			}
		}
		in.close();
	}
}