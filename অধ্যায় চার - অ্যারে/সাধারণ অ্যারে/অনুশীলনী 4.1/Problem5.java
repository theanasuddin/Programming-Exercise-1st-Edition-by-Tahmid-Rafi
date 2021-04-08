package programmingExercise;

import java.util.Scanner;

public class Problem5 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int[] heights = new int[12];

		for (int i = 0; i < heights.length; i++) {
			heights[i] = scan.nextInt();
		}
		scan.close();

		for (int i = 0; i < 2; i++) {
			for (int j = heights.length - 1; j > i; j--) {
				if (heights[j] < heights[j - 1]) {
					int temp = heights[j];
					heights[j] = heights[j - 1];
					heights[j - 1] = temp;
				}
			}
		}
		System.out.printf("%d %d", heights[0], heights[1]);
	}
}