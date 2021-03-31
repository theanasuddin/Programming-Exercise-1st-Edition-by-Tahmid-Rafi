package programmingExercise;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n;

		do {
			n = scan.nextInt();

			if (n == 0) {
				break;
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < i + 1; j++) {
					System.out.printf("*");
				}
				System.out.printf("\n");
			}
		} while (n != 0);

		scan.close();
	}
}
