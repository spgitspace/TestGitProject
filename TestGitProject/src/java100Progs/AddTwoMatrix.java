/*32. How to add two matrix in java Program*/

package java100Progs;

import java.util.Scanner;

public class AddTwoMatrix {

	public static void main(String[] args) {

		int r1, c1, c, d;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number of rows & columns of the matrix : ");
		r1 = in.nextInt();
		c1 = in.nextInt();

		int first[][] = new int[r1][c1];
		int second[][] = new int[r1][c1];
		int sum[][] = new int[r1][c1];

		System.out.println("Enter the elements of first matrix : ");
		for (c = 0; c < r1; c++) {
			for (d = 0; d < c1; d++) {
				first[c][d] = in.nextInt();
			}
		}

		System.out.println("Enter the elements of second matrix : ");
		for (c = 0; c < r1; c++) {
			for (d = 0; d < c1; d++) {
				second[c][d] = in.nextInt();
			}
		}

		// Print sum of the 2 matrices
		for (c = 0; c < r1; c++) {
			for (d = 0; d < c1; d++) {
				sum[c][d] = first[c][d] + second[c][d];
				//System.out.println("Addition of the matrices are :");
				System.out.print(sum[c][d] + " ");
			}
			System.out.println();
		}
		in.close();
	}
}
