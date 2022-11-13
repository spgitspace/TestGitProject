/*6. How to swap 2 no using 3rd variable Program in java*/

package java100Progs;

import java.util.Scanner;

public class SwapNumbers1 {

	public static void main(String[] args) {

		int x, y, temp;

		// Creating an instance of a Scanner class to accept user input
		Scanner in = new Scanner(System.in);

		System.out.println("Enter Value of x : ");
		x = in.nextInt();
		System.out.println("Enter Value of y : ");
		y = in.nextInt();

		System.out.println("Before Swapping value of x is " + x + " & y is " + y);

		temp = x;
		x = y;
		y = temp;

		System.out.println("After Swapping value of x is " + x + " & y is " + y);
		
		in.close();
	}

}
