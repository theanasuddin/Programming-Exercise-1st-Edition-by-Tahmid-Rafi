package programmingExercise;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n;

		do {
			n = scan.nextInt();
			if (n == 0) {
				break;
			}
			System.out.printf("Remainder: %d\n", n % 6);
		} while (n != 0);
		scan.close();
	}

}
