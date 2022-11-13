/*75. How to add label in AWT program in java*/

package java100Progs;

import java.awt.Frame;
import java.awt.Label;

public class LabelAWT {

	public static void main(String[] args) {

		Frame f = new Frame("Label Example by Technolamror");
		Label l1, l2;
		
		l1 = new Label("First Label");
		l1.setBounds(50, 100, 100, 30);
	
		l2 = new Label("Second Label");
		l2.setBounds(50, 150, 100, 30);
		
		f.add(l1);
		f.add(l2);
		
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);

	}

}
