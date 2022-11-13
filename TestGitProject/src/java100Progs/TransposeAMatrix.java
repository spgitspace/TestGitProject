/*34. How to get transpose of matrix in java Program*/

package java100Progs;

import java.util.Scanner;

public class TransposeAMatrix {

	public static void main(String[] args) {
		int r1, c1, c, d;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number of rows and columns of matrix");
		r1 = in.nextInt();
		c1 = in.nextInt();

		int matrix[][] = new int[r1][c1];

		System.out.println("Enter the elements of matrix");
		for (c = 0; c < r1; c++)
			for (d = 0; d < c1; d++)
				matrix[c][d] = in.nextInt();

		int transpose[][] = new int[c1][r1];

		for (c = 0; c < r1; c++) {
			for (d = 0; d < c1; d++)
				transpose[d][c] = matrix[c][d];
		}

		System.out.println("Transpose of entered matrix:-");
		for (c = 0; c < c1; c++) {
			for (d = 0; d < r1; d++) {
				System.out.print(transpose[c][d] + " ");
			}
			System.out.print("\n");
		}

		in.close();
	}

}
