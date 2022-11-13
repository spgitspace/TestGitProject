/*80. How to convert string to integer in java program*/

package java100Progs;

public class StringToIntExample {

	public static void main(String[] args) {
		String s = "200";

		int i = Integer.parseInt(s); // 200

		System.out.println(s + 100);// 200100 because + is string concatenation operator

		System.out.println(i + 100);// 300 because + is binary plus operator

	}

}
