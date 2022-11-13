/*52. How to create Interface in java Program*/

//This is an interface - InterfaceInfo
//Check for the implementation - InterfaceImple


package java100Progs;

public class InterfaceImple implements InterfaceInfo {

	public static void main(String[] args) {

		InterfaceImple obj = new InterfaceImple();
		obj.display();

	}

	// Defining method declared in interface
	public void display() {
		System.out.println(language + " is awesome.");
	}

}
