/*70. How to write data in text file using java program*/

package java100Progs;

import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("D:\\testout.txt");
			fos.write(65);
			fos.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
