package programmingExercise;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int year;

		year = scan.nextInt();
		scan.close();

		// 3rd way (without nested if-else)
		if (year % 400 == 0) {
			System.out.printf("Leap year.\n");
		} else if (year % 100 == 0) {
			System.out.printf("Not a leap year.\n");
		} else if (year % 4 == 0) {
			System.out.printf("Leap year.\n");
		} else {
			System.out.printf("Not a leap year.\n");
		}
	}

}
