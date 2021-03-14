package programmingExercise;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float armLength, area;

		System.out.printf("Arm Length: ");
		armLength = scan.nextFloat();
		scan.close();

		area = (float) (Math.pow(armLength, 2));

		System.out.printf("Area: %.2f\n", area);

	}

}
