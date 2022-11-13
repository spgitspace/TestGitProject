/*35. How to compare 2 string in java Program*/

/*If the first string is lexicographically greater than the second string, it returns a positive number (difference of character value). 
If the first string is less than the second string lexicographically, it returns a negative number. 
if the first string is lexicographically equal to the second string, it returns 0.
if s1 > s2, it returns positive number  
if s1 < s2, it returns negative number  
if s1 == s2, it returns 0*/ 

package java100Progs;

public class LastIndexOfExample {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "meklo";
		String s4 = "hemlo";
		
		System.out.println(s1.compareTo(s2)); // 0
		System.out.println(s1.compareTo(s3)); // -5
		System.out.println(s1.compareTo(s4)); // -1

	}

}