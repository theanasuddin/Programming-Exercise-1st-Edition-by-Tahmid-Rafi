package programmingExercise;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number;

		number = scan.nextInt();
		scan.close();

		if (number % 2 == 0) {
			System.out.printf("Even\n");
		} else {
			System.out.printf("Odd\n");
		}
	}

}
