/*78. How to create Swing program in java*/

package java100Progs;

import java.awt.Choice;
import java.awt.Frame;

public class DropdownAWT {

	DropdownAWT() {
		Frame f = new Frame();
		Choice c = new Choice();

		c.setBounds(100, 100, 75, 75);
		c.add("Item 1 by Rajendra");
		c.add("Item 2 by Lamror");
		c.add("Item 3 by Technolamror");
		c.add("Item 4");
		c.add("Item 5");

		f.add(c);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new DropdownAWT();
	}

}
