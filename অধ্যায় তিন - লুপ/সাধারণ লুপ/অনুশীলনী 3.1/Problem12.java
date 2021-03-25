package programmingExercise;

import java.util.Scanner;

public class Problem12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n;
		double base, height, radius, arm_length;

		System.out.print("n: ");
		n = scan.nextInt();

		// a.
		System.out.printf("\na.\n");
		for (int i = 0; i < n; i++) {
			System.out.print("Base: ");
			base = scan.nextDouble();
			System.out.print("Height: ");
			height = scan.nextDouble();

			System.out.printf("Area: %.2f\n\n", (base * height) / 2);
		}

		// b.
		System.out.printf("b.\n");
		for (int i = 0; i < n; i++) {
			System.out.print("Radius: ");
			radius = scan.nextDouble();

			System.out.printf("Area: %.2f\n\n", (Math.pow(radius, 2)) * Math.PI);
		}

		// c.
		System.out.printf("c.\n");
		for (int i = 0; i < n; i++) {
			System.out.print("Arm length: ");
			arm_length = scan.nextDouble();

			System.out.printf("Area: %.2f\n\n", Math.pow(arm_length, 2));
		}
		scan.close();
	}

}
