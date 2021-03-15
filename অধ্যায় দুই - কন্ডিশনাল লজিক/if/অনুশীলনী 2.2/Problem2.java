package programmingExercise;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float ticket_price, amount_of_money;

		System.out.printf("Ticket price: ");
		ticket_price = scan.nextFloat();
		System.out.printf("Amount of money I have: ");
		amount_of_money = scan.nextFloat();
		scan.close();

		if (amount_of_money >= ticket_price) {
			System.out.printf("I can go inside museum.\n");
		}

		if (amount_of_money < ticket_price) {
			System.out.printf("I can't go inside museum.\n");
		}

	}

}
