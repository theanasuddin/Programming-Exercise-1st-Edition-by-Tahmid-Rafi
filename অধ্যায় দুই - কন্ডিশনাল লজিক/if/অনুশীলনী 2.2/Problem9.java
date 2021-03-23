package programmingExercise;

import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double[] heights = new double[5];

		for (int i = 0; i < heights.length; i++) {
			System.out.printf("Person %d height (in meter): ", i + 1);
			heights[i] = scan.nextDouble();
		}
		scan.close();

		double maxHeight = heights[0];
		int index = 0;
		for (int i = 0; i < heights.length; i++) {
			if (heights[i] > maxHeight) {
				maxHeight = heights[i];
				index = i;
			}
		}

		System.out.printf("Person %d has max height of %.2f meter.\n", index + 1, maxHeight);
	}

}
