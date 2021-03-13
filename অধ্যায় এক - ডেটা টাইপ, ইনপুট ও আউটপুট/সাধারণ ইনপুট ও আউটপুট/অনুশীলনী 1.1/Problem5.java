package programmingExercise;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int totalPens, singlePenPrice;

		System.out.printf("Price of a single pen: ");
		singlePenPrice = scan.nextInt();
		System.out.printf("Total number of pens: ");
		totalPens = scan.nextInt();
		scan.close();
		System.out.printf("Total price of all pens: %d\n", (totalPens * singlePenPrice));

	}

}
