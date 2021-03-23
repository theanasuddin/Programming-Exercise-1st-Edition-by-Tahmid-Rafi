package programmingExercise;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double number, square_root;

		System.out.printf("Number: ");
		number = scan.nextDouble();
		scan.close();

		square_root = Math.sqrt(number);

		if ((square_root * square_root) == number) {
			System.out.printf("Given number is a perfect square.\n");
		}

		if (!((square_root * square_root) == number)) {
			System.out.printf("Given number isn't a perfect square.\n");
		}
	}

}
