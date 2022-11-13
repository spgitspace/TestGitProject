/*15. How to compare 2 string in Java program*/

package java100Progs;

import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {

		String s1, s2;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the first string");
		s1 = in.next();
		System.out.println("Enter the second string");
		s2 = in.next();

		if (s1.compareTo(s2) > 0)
			System.out.println("First string is greater than second.");
		else if (s1.compareTo(s2) < 0)
			System.out.println("First string is smaller than second.");
		else
			System.out.println("Both strings are equal.");

		in.close();

	}
}
