package programmingExercise;

import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		double sum = 0;

		System.out.print("n: ");
		n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.printf("Number %d: ", i + 1);
			sum += scan.nextDouble();
		}
		scan.close();

		System.out.printf("Average: %.2f\n", sum / n);
	}

}
