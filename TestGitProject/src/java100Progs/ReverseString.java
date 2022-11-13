/*30. Print reverse string in java Program*/

package java100Progs;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String original, reverse = "";
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a String to reverse : ");
		original = in.next();

		int length = original.length();

		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
			
		}
		System.out.println("Reverse of the entered string is: " + reverse);
		in.close();
	}

}
