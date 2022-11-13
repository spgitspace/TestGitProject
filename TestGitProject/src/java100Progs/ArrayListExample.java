package java100Progs;

/*86. Create ArrayList program in java*/
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();// Creating arraylist

		list.add("Rajendra");// Adding object in arraylist
		list.add("Mahendra");
		list.add("Raja");
		list.add("Technolamror");

		// Traversing list through Iterator
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
