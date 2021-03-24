package programmingExercise;

import java.util.Scanner;

public class Problem4 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int x, y;
		char command;

		System.out.printf("Your position (x, y): ");
		x = scan.nextInt();
		y = scan.nextInt();

		System.out.printf("u or d or l or r: ");
		command = scan.next().charAt(0);
		scan.close();

		if (command == 'u') {
			y++;
		} else if (command == 'd') {
			y--;
		} else if (command == 'l') {
			x--;
		} else if (command == 'r') {
			x++;
		} else {
			System.out.printf("Invalid command!\n");
		}

		System.out.printf("Your new position: (%d, %d)\n", x, y);
	}
}