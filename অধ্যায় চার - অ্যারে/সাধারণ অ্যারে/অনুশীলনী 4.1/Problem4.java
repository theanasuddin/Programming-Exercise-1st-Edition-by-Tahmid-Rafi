package programmingExercise;

import java.util.Scanner;

public class Problem4 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int[] ages = new int[10];

		for (int i = 0; i < ages.length; i++) {
			ages[i] = scan.nextInt();
		}
		scan.close();

		for (int i = ages.length - 1; i > ages.length - 3; i--) {
			for (int j = 0; j < i; j++) {
				if (ages[j] > ages[j + 1]) {
					int temp = ages[j];
					ages[j] = ages[j + 1];
					ages[j + 1] = temp;
				}
			}
		}
		System.out.printf("%d %d", ages[ages.length - 2], ages[ages.length - 1]);
	}
}