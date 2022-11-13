/*14. Find factorial for given large no Program in Java*/
/*How do you find the factorial of a number?
 * Ans: The factorial of a number is the product of all the integers from 1 to that number.
 * For example,the factorial of 6 is 1*2*3*4*5*6=720.*/

package java100Progs;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialBig {

	public static void main(String[] args) {
		int n, c;

		BigInteger inc = new BigInteger("1");
		BigInteger fact = new BigInteger("1");

		Scanner in = new Scanner(System.in);

		System.out.println("Input an integer");
		n = in.nextInt();

		if (n < 0) {
			System.out.println("Number should be non-negative");
		} else {
			for (c = 1; c <= n; c++) {
				fact = fact.multiply(inc);
				inc = inc.add(BigInteger.ONE);
			}
		}
		System.out.println(n + "! = " + fact);

		in.close();
	}

}
