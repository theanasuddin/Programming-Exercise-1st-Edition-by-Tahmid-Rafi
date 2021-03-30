package programmingExercise;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n, number = -1, minimum, maximum;

		System.out.printf("n: ");
		n = scan.nextInt();

		if (n > 0) {
			System.out.printf("Numbers: ");
			number = scan.nextInt();
		}

		minimum = maximum = number;

		for (int i = 1; i < n; i++) {
			number = scan.nextInt();

			if (number < minimum) {
				minimum = number;
			}

			if (number > maximum) {
				maximum = number;
			}
		}
		scan.close();

		System.out.printf("Maximum: %d\n", maximum);
		System.out.printf("Minimum: %d", minimum);
	}
}
