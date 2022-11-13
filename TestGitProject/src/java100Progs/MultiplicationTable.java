/*25. Print Multiplication table Program in java*/

package java100Progs;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {

		int n, c;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter an integer to print it's multiplication table : ");
		n = in.nextInt();
		
		System.out.print("Multiplication table for " + n + " is :");

		for (c = 1; c <= 10; c++) {

			System.out.println(n * c);
		}
		in.close();
	}
}
