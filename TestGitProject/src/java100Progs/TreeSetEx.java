/*91. How to create TreeSet program in java*/

package java100Progs;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String args[]) {

		// Creating and adding elements
		TreeSet<String> al = new TreeSet<String>();

		al.add("Rajendra");
		al.add("Raja");
		al.add("Ravi");
		al.add("Technolamror");

		Iterator<String> itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
