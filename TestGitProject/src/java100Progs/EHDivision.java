/*49. Exception Handling java Program*/

package java100Progs;

import java.util.Scanner;

public class EHDivision {

	public static void main(String[] args) {

		int a, b, result;

		Scanner in = new Scanner(System.in);

		System.out.println("Input two integers");
		a = in.nextInt();
		b = in.nextInt();

		// try block
		try {
			result = a / b;
			System.out.println("Result = " + result);
		}
		// catch block
		catch (ArithmeticException e) {
			System.out.println("Exception caught: Division by zero.");
		}

		in.close();

	}

}
