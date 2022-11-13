/*60. Leaner search Program in java
Linear search is used to search a key element from multiple elements. Linear search is less used today because it is slower than binary search and hashing.

Algorithm:

    Step 1: Traverse the array
    Step 2: Match the key element with array element
    Step 3: If key element is found, print the result accordingly
    Step 4: If key element is not found, print the result accordingly*/

package java100Progs;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {

		int array[];
		int c, n, search;

		// Accept how many numbers will be added in an array
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		n = in.nextInt();

		// Initiate Array & store all the values in that array
		array = new int[n]; // Initialized an array
		System.out.println("Enter " + n + " integers in an array :");
		for (c = 0; c < n; c++)
			array[c] = in.nextInt();

		// Get the user input for which number user wishes to search
		System.out.println("Enter number to be searched : ");
		search = in.nextInt();

		for (c = 0; c < n; c++) {
			if (array[c] == search) // If the searching element is present in the array
			{
				System.out.println(search + " is present at location " + (c + 1) + ".");
				break;
			} 
		}
		if (c == n) /* Searching element is not found */
			System.out.println(search + " is not present in array.");
		
		in.close();
	}

}
