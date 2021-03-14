package programmingExercise;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float length, width, area;

		System.out.printf("Length: ");
		length = scan.nextFloat();
		System.out.printf("Width: ");
		width = scan.nextFloat();
		scan.close();

		area = width * length;

		System.out.printf("Area: %.2f\n", area);
	}

}
