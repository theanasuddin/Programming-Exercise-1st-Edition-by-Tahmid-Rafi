package programmingExercise;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float c, f;

		c = scan.nextFloat();
		scan.close();

		f = ((c * 9) / 5) + 32;

		System.out.printf("%.2f\n", f);

	}

}
