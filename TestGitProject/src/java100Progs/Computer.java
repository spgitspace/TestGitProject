/*46. How to create Multiple class in java Program*/

package java100Progs;

public class Computer {

	Computer() {
		System.out.println("Constructor of Computer class."); // 1
	}

	void computer_method() {
		System.out.println("Power gone! Shut down your PC soon..."); // 2
	}

	public static void main(String[] args) {
		Computer my = new Computer();
		my.computer_method();

		Laptop your = new Laptop();
		your.laptop_method();
	}
}

class Laptop {

	Laptop() {
		System.out.println("Constructor of Laptop class."); // 3
	}

	void laptop_method() {
		System.out.println("99% Battery available."); // 4
	}

}
