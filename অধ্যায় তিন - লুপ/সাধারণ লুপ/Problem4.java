package programmingExercise;

import java.util.Scanner;

public class Problem4 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String number;
		int sum_of_digits = 0;

		System.out.printf("Number: ");
		number = scan.next();
		scan.close();

		for (int i = 0; i < number.length(); i++) {
			sum_of_digits += (number.charAt(i) - '0');
		}

		if (sum_of_digits % 3 == 0) {
			System.out.printf("Yes.\n");
		} else {
			System.out.printf("No.\n");
		}
	}
}