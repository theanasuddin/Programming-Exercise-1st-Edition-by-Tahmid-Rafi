package programmingExercise;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double a, b;

		a = scan.nextDouble();
		b = scan.nextDouble();
		scan.close();

		if (a > b) {
			System.out.printf("%.2f\n", a);
		} else {
			System.out.printf("%.2f\n", b);
		}
	}

}
