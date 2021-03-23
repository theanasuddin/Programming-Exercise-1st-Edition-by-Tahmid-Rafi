package programmingExercise;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean elder_brother_came;

		System.out.printf("Will elder brother come? (true / false): ");
		elder_brother_came = scan.nextBoolean();
		scan.close();

		if (elder_brother_came) {
			System.out.printf("Mitu will buy hilsha fish.\n");
		} else {
			System.out.printf("Mitu will buy vegetables.\n");
		}
	}

}
