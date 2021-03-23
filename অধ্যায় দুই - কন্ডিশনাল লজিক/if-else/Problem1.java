package programmingExercise;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int jony;

		jony = scan.nextInt();
		scan.close();

		if (jony >= 40) {
			System.out.printf("Jony passed the test.\n");
		} else {
			System.out.printf("Jony did not pass the test.\n");
		}
	}
}
