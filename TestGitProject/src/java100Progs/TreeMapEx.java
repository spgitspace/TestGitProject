/*95. How to create TreeMap program in java*/

package java100Progs;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String args[]) {
	
		TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
	
		hm.put(100, "Amit");
		hm.put(102, "Ravi");
		hm.put(101, "Vijay");
		hm.put(103, "Technolamror");
	
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
