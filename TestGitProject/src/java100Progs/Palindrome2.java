package java100Progs;

import java.util.Scanner;

public class Palindrome2 {

	public static void main(String[] args) {

		String inputString;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a string to check if it is Palindrome : ");
		inputString = in.next();

		int length = inputString.length();
		int i, begin, middle, end;

		begin = 0;
		end = length - 1;
		middle = (begin + end) / 2;

		for (i = begin; i <= middle; i++) {
			if (inputString.charAt(begin) == inputString.charAt(end)) {
				begin++;
				end--;
			} else {
				break;
			}

			if (i == middle + 1) {
				System.out.println("It's Palindrome.");
			} else {
				System.out.println("Not a Palindrome.");
			}
		}
	}
}