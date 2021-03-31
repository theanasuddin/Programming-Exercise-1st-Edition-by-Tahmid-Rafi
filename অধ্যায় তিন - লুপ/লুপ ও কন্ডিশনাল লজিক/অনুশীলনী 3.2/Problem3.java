package programmingExercise;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int age, count = 0;

		for (int i = 0; i < 10; i++) {
			age = scan.nextInt();

			if (age >= 60) {
				count++;
			}
		}
		scan.close();

		System.out.printf("%d\n", count);
	}
}