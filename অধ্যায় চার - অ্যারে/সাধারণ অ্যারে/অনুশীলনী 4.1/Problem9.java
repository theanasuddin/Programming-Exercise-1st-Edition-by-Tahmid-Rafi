package programmingExercise;

import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] numbers;
		int n, mid;
		double median;

		System.out.printf("n: ");
		n = scan.nextInt();

		numbers = new int[n];
		mid = n / 2;

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scan.nextInt();
		}
		scan.close();

		for (int i = numbers.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (numbers[j] > numbers[j + 1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}

		if (n % 2 == 0) {
			median = (numbers[mid] + numbers[mid - 1]) / 2.00;
		} else {
			median = numbers[mid];
		}

		System.out.printf("Median: %.2f ", median);
	}

}
