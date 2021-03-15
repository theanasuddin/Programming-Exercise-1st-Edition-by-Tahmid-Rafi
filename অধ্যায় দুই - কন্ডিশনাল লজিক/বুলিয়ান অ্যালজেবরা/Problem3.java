package programmingExercise;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean A, B, C, result;

		A = scan.nextBoolean();
		B = scan.nextBoolean();
		C = scan.nextBoolean();
		scan.close();

		// A.(B+C), '.' means AND, '+' means OR
		result = A && (B || C);

		System.out.printf("A.(B+C): %s\n", result);
	}
}
