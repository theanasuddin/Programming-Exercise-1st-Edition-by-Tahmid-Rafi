package programmingExercise;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double money;
		boolean pickle_seller_came = false;

		System.out.printf("Amount of money Raihan have: ");
		money = scan.nextDouble();
		if (money > 10.0) {
			System.out.printf("Will pickle seller come? (true / false): ");
			pickle_seller_came = scan.nextBoolean();
		}
		scan.close();

		if ((money > 10.0) && !pickle_seller_came) {
			System.out.printf("Raihan can eat ice cream.\n");
		} else if ((money > 10.0) && pickle_seller_came) {
			System.out.printf("Raihan will eat pickle.\n");
		} else {
			System.out.printf("Raihan can't eat anything.\n");
		}
	}

}
