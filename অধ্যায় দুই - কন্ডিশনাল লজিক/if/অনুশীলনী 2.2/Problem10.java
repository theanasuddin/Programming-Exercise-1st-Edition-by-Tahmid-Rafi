package programmingExercise;

import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] ages = new int[6];

		for (int i = 0; i < ages.length; i++) {
			System.out.printf("Person %d age: ", i + 1);
			ages[i] = scan.nextInt();
		}
		scan.close();

		int amount = 0;
		for (int i = 0; i < ages.length; i++) {
			if (ages[i] >= 30) {
				amount++;
			}
		}

		System.out.printf("%d people has an age of 30 or more.\n", amount);
	}

}
