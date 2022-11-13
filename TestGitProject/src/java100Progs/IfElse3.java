/*12. Nested If Else clause in java*/

package java100Progs;

import java.util.Scanner;

public class IfElse3 {

	public static void main(String[] args) {

		int marksObtained, passingMarks;
		char grade;

		passingMarks = 40;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter marks you have obtained : ");
		marksObtained = in.nextInt();

		if (marksObtained >= passingMarks) {
			if (marksObtained > 90)
				grade = 'A';
			else if (marksObtained > 75)
				grade = 'B';
			else if (marksObtained > 60)
				grade = 'C';
			else
				grade = 'D';
			System.out.println("You passed the exam and your grade is " + grade);

		} else {
			grade = 'F';
			System.out.println("You failed and your grade is " + grade);
		}

		in.close();

	}

}
