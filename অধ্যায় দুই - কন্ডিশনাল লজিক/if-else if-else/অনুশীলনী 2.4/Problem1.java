package programmingExercise;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int temp;

		System.out.printf("Temperature in celsius: ");
		temp = scan.nextInt();
		scan.close();

		if (temp > 100) {
			System.out.printf("Gaseous.\n");
		} else if (temp >= 0) {
			System.out.printf("Liquid.\n");
		} else {
			System.out.printf("Solid.\n");
		}

	}

}
