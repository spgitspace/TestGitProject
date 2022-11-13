/*48. How to create constructor overloading in java Program*/

package java100Progs;

public class Language {
	
	String name; // Global Variable Name
	
	Language() {
		System.out.println("Constructor method is called.");
	}

	Language(String t) {
		name = t;
	}

	public static void main(String[] args) {
		Language cpp = new Language();
		cpp.setName("C++");

		Language java = new Language("Java");

		java.getName();
		cpp.getName();
	}

	void setName(String t) {
		name = t;
	}

	void getName() {
		System.out.println("Language name: " + name);
	}

}
