package programmingExercise;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input, sumOfDigits = 0;

		input = scan.nextInt();
		scan.close();

		while (input != 0) {
			sumOfDigits += (input % 10);
			input /= 10;
		}
		System.out.printf("Sum of all digits: %d\n", sumOfDigits);
	}

}
