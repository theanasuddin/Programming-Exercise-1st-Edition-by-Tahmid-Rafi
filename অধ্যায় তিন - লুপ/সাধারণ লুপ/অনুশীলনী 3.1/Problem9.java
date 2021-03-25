package programmingExercise;

import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double sum = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.printf("Number %d: ", i);
			sum += (scan.nextDouble() % 10);
		}
		scan.close();

		System.out.printf("Sum: %.2f\n", sum);
	}

}
