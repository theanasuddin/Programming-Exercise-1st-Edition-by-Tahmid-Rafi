package programmingExercise;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scan.nextInt();
		}
		scan.close();

		for (int i = numbers.length - 1; i > 0; i--) {
			System.out.printf("%d ", numbers[i]);
		}
	}
}
