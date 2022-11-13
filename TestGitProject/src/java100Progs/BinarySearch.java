/*61. Binary search Program in java
Binary Search Algorithm: The basic steps to perform Binary Search are:

- Begin with the mid element of the whole array as a search key.
- If the value of the search key is equal to the item then return an index of the search key.
- Or if the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half.
- Otherwise, narrow it to the upper half.
- Repeatedly check from the second point until the value is found or the interval is empty.

Binary Search Algorithm can be implemented in the following two ways
- Iterative Method
- Recursive Method */

package java100Progs;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		int array[];
		int c, first, last, middle, n, search;

		// Accept how many numbers will be added in an array
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		n = in.nextInt(); // 5

		// Initiate Array & store all the values in that array
		array = new int[n]; // Initialized an array
		System.out.println("Enter " + n + " integers in an array :");
		for (c = 0; c < n; c++)
			array[c] = in.nextInt(); // 1,2,3,4,5

		// Get the user input for which number user wishes to search
		System.out.println("Enter number to be searched : ");
		search = in.nextInt(); // 4

		first = 0;
		last = n - 1;
		middle = (first + last) / 2;

		while (first <= last) {
			if (array[middle] < search)
				first = middle + 1;
			else if (array[middle] == search) {
				System.out.println(search + " found at location " + (middle + 1) + ".");
				break;
			} else
				last = middle - 1;
			middle = (first + last) / 2;
		}

		if (first > last)
			System.out.println(search + " is not present in the list.");

		in.close();

	}
}
