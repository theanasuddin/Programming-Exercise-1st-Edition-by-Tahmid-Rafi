package programmingExercise;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double[] numbers;
		double sum = 0, mean = 0, sqr_diff_sum = 0, sigma = 0;
		int n;

		System.out.printf("n: ");
		n = scan.nextInt();

		numbers = new double[n];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scan.nextDouble();
		}
		scan.close();

		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}

		mean = sum / 10;
		System.out.printf("Mean: %g\n", mean);

		for (int i = 0; i < numbers.length; i++) {
			sqr_diff_sum += Math.pow(mean - numbers[i], 2);
		}

		sigma = Math.sqrt(sqr_diff_sum / 10);
		System.out.printf("Standard Deviation: %g", sigma);
	}
}
