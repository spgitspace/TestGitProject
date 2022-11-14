/*8. How to add two (small) numbers Program in java*/

package java100Progs;

import java.util.Scanner;

public class Add2Numbers {

	public static void main(String[] args) {

		int sum1, sum2;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the value of sum1 : ");
		sum1 = in.nextInt();
		
		System.out.println("Enter the value of sum2 : ");
		sum2 = in.nextInt();
		
		System.out.println("Addition of sum1 & sum2 : " + (sum1 + sum2));

		in.close();
	}
}
