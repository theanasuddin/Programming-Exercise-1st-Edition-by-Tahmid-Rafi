package programmingExercise;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char character;

		character = scan.next().charAt(0);
		scan.close();

		if ((character >= 65 && character <= 90) || (character >= 97 && character <= 122)) {
			if (character == 'a' || character == 'A' || character == 'e' || character == 'E' || character == 'i'
					|| character == 'I' || character == 'o' || character == 'O' || character == 'u'
					|| character == 'U') {
				System.out.printf("Vowel.\n");
			} else {
				System.out.printf("Consonent.\n");
			}
		} else {
			System.out.printf("Not an alphabet.\n");
		}
	}

}
