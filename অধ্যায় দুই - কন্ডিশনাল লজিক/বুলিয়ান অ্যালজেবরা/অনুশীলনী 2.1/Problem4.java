package programmingExercise;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean france_will_go, did_it_rain;
		int france_goals, spain_goals;

		System.out.printf("Did It Rain?: ");
		did_it_rain = scan.nextBoolean();
		System.out.printf("France Goals: ");
		france_goals = scan.nextInt();
		System.out.printf("Spain Goals: ");
		spain_goals = scan.nextInt();
		scan.close();

		france_will_go = !did_it_rain && (france_goals > spain_goals);

		System.out.printf("Will France Goto Next Round?: %s\n", france_will_go);
	}

}
