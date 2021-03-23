package programmingExercise;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner scan = new Scanner(System.in);
		int level;

		level = scan.nextInt();
		scan.close();

		if (level > 10) {
			System.out.printf("Higher Secondary.\n");
		} else if (level > 8) {
			System.out.printf("Secondary.\n");
		} else if (level > 5) {
			System.out.printf("Junior.\n");
		} else {
			System.out.printf("Primary.\n");
		}
	}

}
