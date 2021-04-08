package programmingExercise;

import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double[] prices = new double[10];
		int[] item_count = new int[10];
		double total_price = 0;

		System.out.printf("Prices: ");
		for (int i = 0; i < prices.length; i++) {
			prices[i] = scan.nextDouble();
		}

		System.out.printf("Item count: ");
		for (int i = 0; i < item_count.length; i++) {
			item_count[i] = scan.nextInt();
		}
		scan.close();

		for (int i = 0; i < item_count.length; i++) {
			total_price += (prices[i] * item_count[i]);
		}

		System.out.printf("Total price: %.2f ", total_price);
	}

}
