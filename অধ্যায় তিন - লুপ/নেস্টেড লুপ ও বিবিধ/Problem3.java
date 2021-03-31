package programmingExercise;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input, output;

		input = scan.nextInt();

		while (input != 0) {
			output = 0;

			while (input != 0) {
				output *= 10;
				output += (input % 10);
				input /= 10;
			}

			System.out.printf("%d\n", output);
			input = scan.nextInt();
		}
		scan.close();
	}
}