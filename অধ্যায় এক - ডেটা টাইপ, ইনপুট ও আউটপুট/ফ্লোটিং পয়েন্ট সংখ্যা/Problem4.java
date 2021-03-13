package programmingExercise;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float b, h, a;

		b = scan.nextFloat();
		h = scan.nextFloat();
		scan.close();

		a = (float) (0.5 * b * h);

		System.out.printf("%.2f\n", a);

	}

}
