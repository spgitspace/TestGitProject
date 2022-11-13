/*25. Print Multiplication table Program in java*/

package java100Progs;

import java.util.Scanner;

public class MultiplicationTableAnyNum {

	public static void main(String[] args) {

		int a, z, n, c; // NumberRange a to z, Number n, Count c

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the range of numbers to print multiplication tables -");
		System.out.println("Enter start digit : ");
		a = in.nextInt();
		System.out.println("Enter last digit : ");
		z = in.nextInt();

		for (n = a; n <= z; n++) {
			System.out.println();
			for (c = 1; c <= 10; c++) {
				System.out.print(n + "*" + c + " = " + n * c + "	");
			}
		}
		in.close();
	}

}
