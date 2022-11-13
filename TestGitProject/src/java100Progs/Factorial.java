/*14. Find factorial for given no Program in Java*/
/*How do you find the factorial of a number?
 * Ans: The factorial of a number is the product of all the integers from 1 to that number.
 * For example,the factorial of 6 is 1*2*3*4*5*6=720.*/

package java100Progs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		int n, c, fact = 1;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter a number to calculate its factorial : ");
		n = in.nextInt();

		if (n < 0) {
			System.out.println("Number should be non-negative");
		} else {
			for (c = 1; c <= n; c++) {
				fact = fact * c;
			}
			System.out.println("Factorial of " + n + "is : " + fact);
		}
		in.close();
	}
}
