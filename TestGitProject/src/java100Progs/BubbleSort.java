/*62. Bubble sort Program in java
Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in the wrong order. 
This algorithm is not suitable for large data sets as its average and worst-case time complexity is quite high.

Follow the below steps to solve the problem:
- Run a nested for loop to traverse the input array using two variables i and j, such that 0 ≤ i < n-1 and 0 ≤ j < n-i-1
- If arr[j] is greater than arr[j+1] then swap these adjacent elements, else move on
- Print the sorted array*/

package java100Progs;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {

		int n, c, d, swap;

		Scanner in = new Scanner(System.in);

		System.out.println("Input number of integers to sort");
		n = in.nextInt();

		int array[] = new int[n]; // Array initialization

		System.out.println("Enter " + n + " integers in an array : ");
		for (c = 0; c < n; c++)
			array[c] = in.nextInt();

		for (c = 0; c < (n - 1); c++) {
			for (d = 0; d < n - c - 1; d++) {
				if (array[d] > array[d + 1]) // For descending order use
				{
					swap = array[d];
					array[d] = array[d + 1];
					array[d + 1] = swap;
				}
			}
		}

		System.out.println("Sorted list of numbers");

		for (c = 0; c < n; c++)
			System.out.println(array[c]);

		in.close();
	}

}