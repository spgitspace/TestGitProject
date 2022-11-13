/*26. Print prime no Program in java*/
/*Prime numbers - a number that can be divided exactly only by itself and 1, for example 7, 17 and 41*/

package java100Progs;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {

		int n, status = 1, num = 3;

		Scanner in = new Scanner(System.in);

		System.out.println("Please enter how many prime numners you want : ");
		n = in.nextInt();

		if (n >= 1) {

			System.out.println("First " + n + "prime numbers are : ");
			System.out.println(2);
		}

		for (int count = 2; count <= n;) {
			for (int j = 2; j <= Math.sqrt(num); j++) {
				if (num % j == 0) {
					status = 0;
					break;
				}
			}
			if (status != 0) {
				System.out.println(num);
				count++;
			}
			status = 1;
			num++;
		}
		in.close();

	}

}
