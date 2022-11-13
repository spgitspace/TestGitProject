/*28. Print Floyd’s Triangle in java Program*/
/*Floyd’s triangle is a triangle with first natural numbers. It is the right arrangement of the numbers/values or patterns. 
 * Basically, it is a left to right arrangement of natural numbers in a right-angled triangle.
 * Illustration: Suppose if no of rows to be displayed is 5 then the desired output should display 5 rows as:
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15*/

package java100Progs;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {

		int n, num = 1, c, d;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter no. of rows for FloydsTriangle : ");
		n = in.nextInt();

		System.out.println("Floyd's triangle :- ");
		for (c = 1; c <= n; c++) {
			for (d = 1; d <= c; d++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}

		in.close();
	}

}
