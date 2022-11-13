/*43. Find Length, Concatenate and Replace String in Java Program*/

package java100Progs;

public class StringMethods {

	public static void main(String[] args) {

		int n;
		String s = "Java programming", t = "", u = "";

		System.out.println(s); //Java programming

		// Find length of string
		n = s.length();
		System.out.println("Number of characters = " + n); //Number of characters = 16

		// Replace characters in string
		t = s.replace("Java", "C++");
		System.out.println(s);// Java Programming
		System.out.println(t);// C++ Programming

		// Concatenating string with another string
		u = s.concat(" is fun");
		System.out.println(s); // Java Programming
		System.out.println(u); // Java Programming is fun

	}

}
