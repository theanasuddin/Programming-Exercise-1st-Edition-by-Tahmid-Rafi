package programmingExercise;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float x, result;

		x = scan.nextFloat();
		scan.close();

		// a. x^2 - 5x + 12
		result = (float) (Math.pow(x, 2) - (5 * x) + 12);
		System.out.printf("a. %.2f\n", result);

		// b. e^(5x - 1)
		result = (float) (Math.exp((5 * x) - 1));
		System.out.printf("b. %.2f\n", result);

		// c. sin(x / 2)
		result = (float) (Math.sin(x / 2));
		System.out.printf("c. %.2f\n", result);

		// d. cos^2(2x - 1)
		result = (float) (Math.pow(Math.cos((2 * x) - 1), 2));
		System.out.printf("d. %.2f\n", result);

		// e. log2 x^3 + 3x - 1
		result = (float) ((int) (Math.log(Math.pow(x, 3)) / Math.log(2)) + (3 * x) - 1);
		System.out.printf("e. %.2f\n", result);
	}

}
