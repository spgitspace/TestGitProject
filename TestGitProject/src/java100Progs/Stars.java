package java100Progs;

public class Stars {

	public static void main(String[] args) {
		int row, noOfStars;

		for (row = 1; row <= 5; row++) {
			for (noOfStars = 1; noOfStars <= row; noOfStars++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
