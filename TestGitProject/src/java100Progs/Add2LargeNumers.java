/*8. How to add two (large) numbers Program in java*/

package java100Progs;

import java.math.BigInteger;
import java.util.Scanner;

public class Add2LargeNumers {

	public static void main(String[] args) {
		String num1, num2;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the value of num1 : ");
		num1 = in.next();

		System.out.println("Enter the value of num2 : ");
		num2 = in.next();

		// Conversion of String to BigInt
		BigInteger first = new BigInteger(num1);
		BigInteger second = new BigInteger(num2);
		BigInteger sum = first.add(second);

		System.out.println("Addition of num1 & num2 : " + sum);

		in.close();

	}

}
