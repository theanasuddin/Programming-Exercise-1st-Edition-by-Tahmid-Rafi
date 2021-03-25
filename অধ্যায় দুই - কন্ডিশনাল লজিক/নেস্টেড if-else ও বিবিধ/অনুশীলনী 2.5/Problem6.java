package programmingExercise;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int school, shift;
		String badge_color = "";

		System.out.print("School name. Enter 1 for Polashdanga School, enter 2 for Noren Ganguli School: ");
		school = scan.nextInt();
		System.out.print("Shift. Enter 1 for morning shift, enter 2 for evening shift: ");
		shift = scan.nextInt();
		scan.close();

		if (school == 1) {
			if (shift == 1) {
				badge_color = "Yellow.";
			} else if (shift == 2) {
				badge_color = "Green.";
			}
		} else if (school == 2) {
			if (shift == 1) {
				badge_color = "Blue.";
			} else if (shift == 2) {
				badge_color = "Red.";
			}
		}
		System.out.printf("%s\n", badge_color);

	}

}
