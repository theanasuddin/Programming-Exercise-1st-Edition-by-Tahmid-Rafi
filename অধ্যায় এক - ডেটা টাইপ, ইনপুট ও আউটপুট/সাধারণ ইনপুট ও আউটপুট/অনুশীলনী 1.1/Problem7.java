package programmingExercise;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N;

		System.out.printf("Total number of days: ");
		N = scan.nextInt();
		scan.close();
		System.out.printf("Total number of weeks: %d\n", (N / 7));

	}

}
