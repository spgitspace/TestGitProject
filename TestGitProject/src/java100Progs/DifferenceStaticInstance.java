/*45. Difference between Static and Instance method working in java Program*/

package java100Progs;

public class DifferenceStaticInstance {

	public static void main(String[] args) {

		display(); // calling without object - Programming is amazing.
		DifferenceStaticInstance t = new DifferenceStaticInstance();
		t.show(); // calling using object - Java is awesome.

	}

	static void display() {
		System.out.println("Programming is amazing.");
	}

	void show() {
		System.out.println("Java is awesome.");
	}

}
