package programmingExercise;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a, b;
		float result;

		a = scan.nextInt();
		b = scan.nextInt();
		scan.close();

		result = (float) a / b;
		System.out.printf("%f\n", result);
	}

}
