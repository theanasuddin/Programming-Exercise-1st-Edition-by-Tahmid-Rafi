package programmingExercise;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] numbers = new int[10];
		int ones_sum = 0, tens_sum = 0, hundreds_sum = 0;
		int digit;

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scan.nextInt();
		}
		scan.close();

		for (int i : numbers) {
			for (int j = 0; j < 3; j++) {
				digit = i % 10;
				if (j == 0) {
					ones_sum += digit;
				} else if (j == 1) {
					tens_sum += digit;
				} else if (j == 2) {
					hundreds_sum += digit;
				}
				i = i / 10;
			}
		}
		System.out.printf("Ones sum: %d\nTens sum: %d\nHundreds sum: %d", ones_sum, tens_sum, hundreds_sum);
	}
}
