/*87. How to create LinkedList program in java*/

package java100Progs;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();

		list.add("Rajendra");// Adding object in LinkedList
		list.add("Mahendra");
		list.add("Raja");
		list.add("Technolamror");

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
