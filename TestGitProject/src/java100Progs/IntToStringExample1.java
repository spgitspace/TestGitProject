/*81. How to convert integer to string in java program*/

package java100Progs;

public class IntToStringExample1 {

	public static void main(String[] args) {
		int i = 200;

		String s = String.valueOf(i); // Converted Integer to String

		System.out.println(i + 100);// 300 because + is binary plus operator

		System.out.println(s + 100);// 200100 because + is string concatenation operator

	}

}
