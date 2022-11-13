/*5. How to convert Fahrenheit to Celsius Program in java*/

package java100Progs;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {

		int tFh; // Declaring a global variable for Temperature in Fahrenheit
		float tCl; // Declaring a global variable for Temperature in Celsius

		// Creating an instance of a Scanner class to accept user input
		Scanner in = new Scanner(System.in);

		// To accept temperature in Fahrenheit
		System.out.println("Enter temperature in Fahrenheit : ");
		tFh = in.nextInt();

		tCl = ((tFh - 32) * 5) / 9;
		System.out.println("Temperature in Celsius : " + tCl);
		
		in.close();

	}
}
