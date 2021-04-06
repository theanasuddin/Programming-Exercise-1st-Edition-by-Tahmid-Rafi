package programmingExercise;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char[][] grid = new char[7][7];
		int x, y;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				grid[i][j] = '-';
			}
		}

		for (int i = 0; i < 5; i++) {
			x = scan.nextInt();
			y = scan.nextInt();
			grid[x - 1][y - 1] = '*';
		}
		scan.close();

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				System.out.printf("%c", grid[i][j]);
			}
			System.out.printf("\n");
		}
	}
}
