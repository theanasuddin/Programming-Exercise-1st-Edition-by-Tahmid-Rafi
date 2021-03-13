package programmingExercise;

import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int totalApples, singleAppleWeight;

		System.out.printf("Total number of apples: ");
		totalApples = scan.nextInt();
		System.out.printf("Average weight (gm) of a single apple: ");
		singleAppleWeight = scan.nextInt();
		scan.close();
		System.out.printf("Weight (kg) of all apples: %.2f\n", ((totalApples * singleAppleWeight) / 1000.00));

	}

}
