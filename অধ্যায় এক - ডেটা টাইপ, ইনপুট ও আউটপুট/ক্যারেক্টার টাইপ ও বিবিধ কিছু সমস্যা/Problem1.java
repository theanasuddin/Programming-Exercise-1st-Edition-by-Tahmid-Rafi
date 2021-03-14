package programmingExercise;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] marks = new int[5];

		for (int i = 0; i < marks.length; i++) {
			marks[i] = scan.nextInt();
		}
		scan.close();

		for (int i : marks) {
			System.out.printf("%4d\n", i);
		}
	}

}
