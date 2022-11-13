/*9. Find Largest of 3 nos in java Program*/

package java100Progs;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {

		int x, y, z;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter 3 numbers : ");
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();

		// To find largest of 3 numbers
		if (x > y && x > z) {
			System.out.println("x is greater.");
		} else if (y > x && y > z) {
			System.out.println("y is greater.");
		} else if (z > x && z > y) {
			System.out.println("z is greater.");
		} else {
			System.out.println("Entered numbers are not distinct.");
		}
		
		in.close();

	}

}
