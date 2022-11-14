/*97. How to create Array program in java*/

package java100Progs;

public class ArrayEx {

	public static void main(String[] args) {

		int array[] = new int[5];// declaration and instantiation
		
		array[0] = 10;// initialization
		array[1] = 20;
		array[2] = 70;
		array[3] = 40;
		array[4] = 50;
		
		// printing array
		for (int i = 0; i < array.length; i++)// length is the property of array
			System.out.println(array[i]);

	}

}
