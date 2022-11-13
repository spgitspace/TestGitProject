/*50. How to throw exception in java Program*/

package java100Progs;

public class EHThrow {

	static void validate(int age) {
		if (age < 18)
			throw new ArithmeticException("not valid");
		else
			System.out.println("welcome to vote on Technolamror");
	}

	public static void main(String args[]) {
		validate(17);
		System.out.println("rest of the code...");
	}

}
