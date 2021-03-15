package programmingExercise;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] men = new int[6];
		int millionaire = 0;

		for (int i = 0; i < men.length; i++) {
			men[i] = scan.nextInt();

			if (men[i] >= 1000000) {
				millionaire += 1;
			}
		}
		scan.close();
		System.out.printf("Number of millionaires: %d\n", millionaire);
	}

}
