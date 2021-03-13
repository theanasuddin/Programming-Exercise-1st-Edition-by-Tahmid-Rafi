package programmingExercise;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float r, area, volume;
		
		// float pi = (float) Math.acos(-1);

		r = scan.nextFloat();
		scan.close();

		area = (float) (4 * Math.PI * r * r);
		volume = (float) ((4 * Math.PI * r * r * r) / 3);

		System.out.printf("Surface Area: %.2f\n", area);
		System.out.printf("Volume: %.2f\n", volume);
	}

}
