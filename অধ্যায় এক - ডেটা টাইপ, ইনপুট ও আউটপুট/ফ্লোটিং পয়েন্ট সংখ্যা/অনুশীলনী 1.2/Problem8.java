package programmingExercise;

import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float radius, height, volume, surfaceArea;

		System.out.printf("Radius: ");
		radius = scan.nextFloat();
		System.out.printf("Height: ");
		height = scan.nextFloat();
		scan.close();

		volume = (float) (Math.PI * Math.pow(radius, 2) * height);
		surfaceArea = (float) (2 * Math.PI * radius * (height + radius));

		System.out.printf("Volume: %.2f\n", volume);
		System.out.printf("Surface Area: %.2f\n", surfaceArea);
	}

}
