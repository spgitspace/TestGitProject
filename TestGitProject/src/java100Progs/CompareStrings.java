/*15. How to compare 2 string in Java program*/

package java100Progs;

import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {

		String str1, str2;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the first string");
		str1 = in.next();
		System.out.println("Enter the second string");
		str2 = in.next();

		if (str1.compareTo(str2) > 0)
			System.out.println("First string is greater than second.");
		else if (str1.compareTo(str2) < 0)
			System.out.println("First string is smaller than second.");
		else
			System.out.println("Both strings are equal.");

		in.close();

	}
}
