package java100Progs;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {

		int n;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Input an integer");
		
		while ((n = in.nextInt()) != 0) {
			System.out.println("You entered : " + n);
			System.out.println("Input an integer : ");
		}
		
		System.out.println("Out of loop"); // Enter 0 to terminate the program
		
		in.close();
	}
}
