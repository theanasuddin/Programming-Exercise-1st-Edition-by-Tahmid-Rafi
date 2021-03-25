package programmingExercise;

import java.util.Scanner;

public class Problem4 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n;
		char c;

		System.out.printf("c: ");
		c = scan.next().charAt(0);
		System.out.printf("n: ");
		n = scan.nextInt();
		scan.close();

		for (int i = 0; i < n; i++) {
			System.out.printf("%c ", c);
		}
	}
}