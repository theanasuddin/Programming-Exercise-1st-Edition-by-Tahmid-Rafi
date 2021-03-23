package programmingExercise;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double cow_price, goat_average_price, goat_total_price;

		System.out.printf("Price of the cow: ");
		cow_price = scan.nextDouble();
		System.out.printf("Average price of goats: ");
		goat_average_price = scan.nextDouble();
		scan.close();

		goat_total_price = goat_average_price * 5;

		if (goat_total_price > cow_price) {
			System.out.printf("আজিজ সাহেব জিতেছেন!\n");
		} else {
			System.out.printf("আজিজ সাহেব ঠকেছেন!\n");
		}
	}

}
