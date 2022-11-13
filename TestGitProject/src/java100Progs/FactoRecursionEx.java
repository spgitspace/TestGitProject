/*99. How to create Find Factorial No using Recursion Program in java*/

package java100Progs;

public class FactoRecursionEx {

	static int factorial(int n) {
		if (n == 1)
			return 1;
		else
			return (n * factorial(n - 1));
	}

	public static void main(String[] args) {

		System.out.println("Factorial of 5 is: " + factorial(5));

	}

}
