package programmingExercise;

import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int W;

		System.out.printf("Total number of weeks: ");
		W = scan.nextInt();
		scan.close();
		System.out.printf("Total number of episodes aired within %d weeks: %d\n", W, (W * 3));
	}

}
