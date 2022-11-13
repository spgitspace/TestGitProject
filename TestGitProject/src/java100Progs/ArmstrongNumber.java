/*27. Check no is Armstrong or not in java Program*/
/*Armstrong number is a number that is equal to the sum of cubes of its digits. 
For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
Let's try to understand why 153 is an Armstrong number.
153 = (1*1*1)+(5*5*5)+(3*3*3)  
where: (1*1*1)=1  (5*5*5)=125  (3*3*3)=27  So: 1+125+27=153*/

package java100Progs;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int n, sum = 0, temp, remainder, digits = 0;

		Scanner in = new Scanner(System.in);
		System.out.println("Input a number to check if it is an Armstrong Number : ");
		n = in.nextInt();

		temp = n; // Copying number to temp variable

		// Count number of digits
		while (temp != 0) {
			digits++;
			temp = temp / 10;
		}

		temp = n;

		while (temp != 0) {
			remainder = temp % 10;
			sum = sum + power(remainder, digits);
			temp = temp / 10;
		}

		if (n == sum)
			System.out.println(n + " is an Armstrong Number.");
		else
			System.out.println(n + " is not an Armstrong Number.");
		
		in.close();
	}

	//To calculate power
	static int power(int n, int r) {

		int c, p = 1;

		for (c = 1; c <= r; c++)
			p = p * n;

		return p;
	}
}
