package programmingExercise;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int pin1, pin2;

		pin1 = scan.nextInt();
		pin2 = scan.nextInt();
		scan.close();

		if (pin1 == pin2) {
			System.out.printf("The pin codes are equal.\n");
		}

		if (pin1 != pin2) {
			System.out.printf("The pin codes are not equal.\n");
		}
	}

}
