package programmingExercise;

import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double sum = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.printf("Number %d: ", i);
			sum += scan.nextDouble();
		}
		scan.close();

		System.out.printf("Sum: %.2f\n", sum);
	}

}
