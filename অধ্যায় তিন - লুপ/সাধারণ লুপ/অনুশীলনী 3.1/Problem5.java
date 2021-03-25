package programmingExercise;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n, sum_of_digits = 0;

		System.out.print("Number: ");
		n = scan.nextInt();
		scan.close();

		while (n != 0) {
			sum_of_digits += (n % 10);
			n /= 10;
		}

		System.out.printf("%d\n", sum_of_digits);
	}
}
