package programmingExercise;

import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] ages = new int[10];
		float ageTotal = 0;

		for (int i = 0; i < ages.length; i++) {
			System.out.printf("Person %d age: ", i + 1);
			ages[i] = scan.nextInt();
			ageTotal = ageTotal + ages[i];
		}
		scan.close();
		System.out.printf("Average age: %.2f\n", (ageTotal / ages.length));
	}

}
