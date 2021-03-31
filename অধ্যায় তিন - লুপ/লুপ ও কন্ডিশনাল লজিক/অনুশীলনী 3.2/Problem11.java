package programmingExercise;

import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n, number, count = 0;

		System.out.printf("n: ");
		n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			number = scan.nextInt();

			if (number % 3 == 0) {
				count++;
			}
		}
		scan.close();

		System.out.printf("%d", count);
	}

}
