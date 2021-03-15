package programmingExercise;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number;

		number = scan.nextInt();
		scan.close();

		if (number % 3 == 0) {
			System.out.printf("It's a multiple of 3.\n");
		}

		if (number % 5 == 0) {
			System.out.printf("It's a multiple of 5.\n");
		}

	}

}
