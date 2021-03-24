package programmingExercise;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char character;

		character = scan.next().charAt(0);
		scan.close();

		if (character >= 65 && character <= 90) {
			System.out.printf("Uppercase letter.\n");
		} else if (character >= 97 && character <= 122) {
			System.out.printf("Lowercase letter.\n");
		} else if (character >= 48 && character <= 57) {
			System.out.printf("Digit.\n");
		} else {
			System.out.printf("Special Character.\n");
		}
	}

}
