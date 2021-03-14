package programmingExercise;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float edgeLength, volume, surfaceArea;

		System.out.printf("Edge Length: ");
		edgeLength = scan.nextFloat();
		scan.close();

		volume = (float) (Math.pow(edgeLength, 3));
		surfaceArea = (float) (6 * Math.pow(edgeLength, 2));

		System.out.printf("Volume: %.2f\n", volume);
		System.out.printf("Surface Area: %.2f\n", surfaceArea);
	}

}
