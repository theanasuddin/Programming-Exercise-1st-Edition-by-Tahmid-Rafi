package programmingExercise;

import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n, number;

		System.out.printf("n: ");
		n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			number = scan.nextInt();

			if (number % 2 == 0) {
				System.out.printf("It's an even number. Quotient after dividing by 2: %d\n", number / 2);
			} else {
				System.out.printf("It's an odd number. After multiplying by 3 and adding 1: %d\n", (number * 3) + 1);
			}
		}
		scan.close();
	}

}
