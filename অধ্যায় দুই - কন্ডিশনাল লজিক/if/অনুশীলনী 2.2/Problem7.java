package programmingExercise;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int X, Y, food_needed;

		System.out.printf("X: ");
		X = scan.nextInt();
		System.out.printf("Y: ");
		Y = scan.nextInt();
		scan.close();

		food_needed = X * 3;

		if (Y >= food_needed) {
			System.out.printf("Enough food to feed all fish.\n");
		}

		if (!(Y >= food_needed)) {
			System.out.printf("Not enough food to feed all fish.\n");
		}
	}

}
