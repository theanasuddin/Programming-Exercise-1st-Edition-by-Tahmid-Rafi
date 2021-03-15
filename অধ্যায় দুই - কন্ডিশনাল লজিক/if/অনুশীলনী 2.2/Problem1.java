package programmingExercise;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int temp;

		System.out.printf("Temperature (°C): ");
		temp = scan.nextInt();
		scan.close();

		if (temp < 0) {
			System.out.printf("Water is in solid state.\n");
		}

		if (temp >= 0 && temp <= 100) {
			System.out.printf("Water is in liquid state.\n");
		}

		if (temp > 100) {
			System.out.printf("Water is in gaseous state.\n");
		}
	}

}
