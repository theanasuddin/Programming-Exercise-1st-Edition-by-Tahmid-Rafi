package programmingExercise;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double a, b;

		System.out.printf("Radius a (in cm): ");
		a = scan.nextDouble();
		System.out.printf("Radius b (in inch): ");
		b = scan.nextDouble();
		scan.close();

		// converting a to inch
		a = a / 2.54;

		if (a > b) {
			System.out.printf("Circle A has bigger area.\n");
		} else {
			System.out.printf("Circle B has bigger area.\n");
		}

	}

}
