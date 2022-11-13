/*44. How Static block working in java Program*/

package java100Progs;

public class StaticBlock1 {

	public static void main(String[] args) {

		System.out.println("Main method is executed.");
	}

	static {
		System.out.println("Static block is executed before main method.");
	}

}
