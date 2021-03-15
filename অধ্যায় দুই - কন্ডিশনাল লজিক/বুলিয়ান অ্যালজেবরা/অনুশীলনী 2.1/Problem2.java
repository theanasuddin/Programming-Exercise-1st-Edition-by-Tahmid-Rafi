package programmingExercise;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean school_open, have_competition, wakeup_in_the_morning;

		System.out.printf("School Open?: ");
		school_open = scan.nextBoolean();
		System.out.printf("Have Competition?: ");
		have_competition = scan.nextBoolean();
		scan.close();

		wakeup_in_the_morning = school_open || have_competition;

		System.out.printf("Wakeup In The Morning: %s\n", wakeup_in_the_morning);
	}

}
