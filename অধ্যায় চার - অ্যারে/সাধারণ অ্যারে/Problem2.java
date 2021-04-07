package programmingExercise;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] numbers = new int[10];
		int difference, sum = 0;
		double mean;

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scan.nextInt();
		}
		scan.close();

		for (int i = 0; i < numbers.length - 1; i++) {
			difference = Math.abs(numbers[i] - numbers[i + 1]);
			sum += difference;
			System.out.printf("%d ", difference);
		}

		mean = (double) sum / (numbers.length - 1);
		System.out.printf("\nAverage of difference: %g\n", mean);
	}
}
