/*4. How to get user input using Scanner Program in java*/

package java100Progs;

import java.util.Scanner;

public class GetInputFromUser {

	public static void main(String[] args) {

		int a;
		float b;
		String s;
		
		//Creating an instance of a Scanner class to accept user input
		Scanner in = new Scanner(System.in);
		
		//This is to accept a Integer user input & print it on console
		System.out.println("Enter an integer : ");
		a = in.nextInt();
		System.out.println("You entered an integer : " + a);
		
		//This is to accept a Float user input & print it on console
		System.out.println("Enter an float : ");
		b = in.nextFloat();
		System.out.println("You entered an float : " + b);
		
		//This is to accept a String user input & print it on console
		System.out.println("Enter an string : ");
		s = in.next();
		System.out.println("You entered an string : " + s);

		in.close(); //This is to save memory leakage by Scanner instance
		
	}
}
