package programmingExercise;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean A, B, C, D, result;

		System.out.printf("A: ");
		A = scan.nextBoolean();
		System.out.printf("B: ");
		B = scan.nextBoolean();
		System.out.printf("C: ");
		C = scan.nextBoolean();
		System.out.printf("D: ");
		D = scan.nextBoolean();
		scan.close();

		// a. A OR B
		result = A || B;
		System.out.printf("a. A OR B: %s\n", result);

		// b. A AND B
		result = A && B;
		System.out.printf("b. A AND B: %s\n", result);

		// c. A OR NOT B
		result = A || !B;
		System.out.printf("c. A OR NOT B: %s\n", result);

		// d. NOT A AND NOT B
		result = !A && !B;
		System.out.printf("d. NOT A AND NOT B: %s\n", result);

		// e. A OR B OR C
		result = A || B || C;
		System.out.printf("e. A OR B OR C: %s\n", result);

		// f. (A OR B) AND (C OR D)
		result = (A || B) && (C || D);
		System.out.printf("f. (A OR B) AND (C OR D): %s\n", result);

		// g. A OR (B AND (NOT C OR D))
		result = A || (B && (!C || D));
		System.out.printf("g. A OR (B AND (NOT C OR D)): %s\n", result);
	}

}
