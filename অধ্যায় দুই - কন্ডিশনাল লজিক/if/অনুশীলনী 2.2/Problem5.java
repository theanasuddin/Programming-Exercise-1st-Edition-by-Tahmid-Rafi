package programmingExercise;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean will_get_seats;
		int total_no_of_friends = 5, total_seats, current_no_of_passengers;

		System.out.printf("Total number of seats: ");
		total_seats = scan.nextInt();
		System.out.printf("Current no. of passengers: ");
		current_no_of_passengers = scan.nextInt();
		scan.close();

		will_get_seats = current_no_of_passengers + total_no_of_friends <= total_seats;

		if (will_get_seats) {
			System.out.printf("All friends can be accommodated.\n");
		}

		if (!will_get_seats) {
			System.out.printf("All friends can't be accommodated.\n");
		}
	}
}
