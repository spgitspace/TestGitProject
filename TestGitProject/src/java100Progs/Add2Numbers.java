/*8. How to add two (small) numbers Program in java*/

package java100Progs;

import java.util.Scanner;

public class Add2Numbers {

	public static void main(String[] args) {

		int i, j;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the value of i : ");
		i = in.nextInt();
		
		System.out.println("Enter the value of j : ");
		j = in.nextInt();
		
		System.out.println("Addition of i & j : " + (i + j));

		in.close();
	}
}
