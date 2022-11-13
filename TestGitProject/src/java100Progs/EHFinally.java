/*51. Advantage of Finally in Exception Handling java Program*/

package java100Progs;

public class EHFinally {

	public static void main(String[] args) {
		try {
			long data[] = new long[1000000000];
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block will execute always.");
		}
	}

}
