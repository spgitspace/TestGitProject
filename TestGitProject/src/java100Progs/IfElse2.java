/*11. If Else clause in java- Program 2*/

package java100Progs;

import java.util.Scanner;

public class IfElse2 {
	public static void main(String[] args) {

		int marksObtained, passingMarks;

		passingMarks = 40;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter marks you have obtained : ");
		marksObtained = in.nextInt();

		if (marksObtained >= passingMarks) {
			System.out.println("You are pass.");
		} else {
			System.out.println("You are fail.");
		}
		
		in.close();

	}

}
