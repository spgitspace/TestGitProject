/*13. How to check Odd and Even Number in java*/

package java100Progs;

import java.util.Scanner;

public class OddOrEven {
	
	public static void main(String[] args) {
		
		int x;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter an integer to check if it is odd or even : ");
		
		x = in.nextInt();
		
		if ( x % 2 == 0 )
		System.out.println("You entered an even number.");
		else
		System.out.println("You entered an odd number.");
		
		in.close();
	}

}
