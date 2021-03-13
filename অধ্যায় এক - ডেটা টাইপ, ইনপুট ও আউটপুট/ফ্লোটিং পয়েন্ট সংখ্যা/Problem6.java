package programmingExercise;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float x, result;

		x = scan.nextFloat();
		scan.close();

		result = (float) (Math.pow(x, 5) - (3 * Math.pow(x, 4)) - (7 * Math.pow(x, 3)) + (13 * Math.pow(x, 2)) + 3742);

		System.out.printf("%.2f\n", result);

	}

}
