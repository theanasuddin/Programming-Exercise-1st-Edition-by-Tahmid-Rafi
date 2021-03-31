package programmingExercise;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number;

		do {
			number = scan.nextInt();

			if (number == 0) {
				break;
			}

			if (number % 6 == 0) {
				System.out.printf("%d is divisible by 6.\n", number);
			} else {
				System.out.printf("%d is not divisible by 6.\n", number);
			}
		} while (number != 0);
		scan.close();
	}
}
