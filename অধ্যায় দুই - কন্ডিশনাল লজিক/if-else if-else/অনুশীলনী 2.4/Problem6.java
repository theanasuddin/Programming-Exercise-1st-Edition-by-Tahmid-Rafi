package programmingExercise;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean sibling1_could, sibling2_could, sibling3_could;

		System.out.printf("Could sibling 1 go all the way? (true / false): ");
		sibling1_could = scan.nextBoolean();
		System.out.printf("Could sibling 2 go all the way? (true / false): ");
		sibling2_could = scan.nextBoolean();
		System.out.printf("Could sibling 3 go all the way? (true / false): ");
		sibling3_could = scan.nextBoolean();
		scan.close();

		if (sibling1_could && sibling2_could && sibling3_could) {
			System.out.printf("Will get pizza.\n");
		} else if ((sibling1_could && sibling2_could) || (sibling1_could && sibling3_could)
				|| (sibling2_could && sibling3_could)) {
			System.out.printf("Will get chinese.\n");
		} else if (sibling1_could || sibling2_could || sibling3_could) {
			System.out.printf("Will get ice cream.\n");
		} else {
			System.out.printf("Will get chocolate.\n");
		}
	}

}
