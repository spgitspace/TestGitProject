/*71. How to read data from text file using java program*/

package java100Progs;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String args[]) {
		try {
			FileInputStream fin = new FileInputStream("D:\\Technolamror.txt");
			int i = fin.read();
			System.out.print((char) i);
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}