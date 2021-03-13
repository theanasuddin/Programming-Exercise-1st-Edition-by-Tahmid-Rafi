package programmingExercise;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float a, b, c, sum = 0;

		a = scan.nextFloat();
		b = scan.nextFloat();
		c = scan.nextFloat();
		scan.close();

		sum = a + b + c;
		System.out.printf("%.2f\n", sum / 3);
	}

}
