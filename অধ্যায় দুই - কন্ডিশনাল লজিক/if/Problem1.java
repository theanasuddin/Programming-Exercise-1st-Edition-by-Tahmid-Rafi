package programmingExercise;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number;

		number = scan.nextInt();
		scan.close();

		if (number % 2 == 0) {
			System.out.printf("It's an even number.\n");
		}

	}

}
