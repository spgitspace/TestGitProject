/*39. How to split string in java Program*/

package java100Progs;

public class SplitExample {

	public static void main(String[] args) {

		String s1 = "java string split method by Technolamror";
		String[] words = s1.split("\\s");// splits the string based on whitespaces
		
		// using java advanced for-each loop to print elements of string array
		for (String w : words) {
			System.out.println(w);
		}
	}
}
