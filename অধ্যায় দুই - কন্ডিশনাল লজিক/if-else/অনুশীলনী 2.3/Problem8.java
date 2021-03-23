package programmingExercise;

import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double x, y, m, rahmat_1gm_price, bijoy_1gm_price;

		System.out.printf("x (tk): ");
		x = scan.nextDouble();
		System.out.printf("y (tk): ");
		y = scan.nextDouble();
		System.out.printf("m (gm): ");
		m = scan.nextDouble();
		scan.close();

		rahmat_1gm_price = x / (4 * m);
		bijoy_1gm_price = y / 1000;

		if (rahmat_1gm_price < bijoy_1gm_price) {
			System.out.printf("Buying from rahmat will be beneficial.\n");
		} else {
			System.out.printf("Buying from bijoy will be beneficial.\n");
		}
	}

}
