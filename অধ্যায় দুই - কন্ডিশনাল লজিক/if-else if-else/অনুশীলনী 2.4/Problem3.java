package programmingExercise;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int shoe_size, porbot_size, pahar_size, tila_size;

		System.out.printf("Shoe size: ");
		shoe_size = scan.nextInt();
		System.out.printf("Porbot size: ");
		porbot_size = scan.nextInt();
		System.out.printf("Pahar size: ");
		pahar_size = scan.nextInt();
		System.out.printf("Tila size: ");
		tila_size = scan.nextInt();
		scan.close();

		if (shoe_size == porbot_size) {
			System.out.printf("Porbot will get.\n");
		} else if (shoe_size == pahar_size) {
			System.out.printf("Pahar will get.\n");
		} else if (shoe_size == tila_size) {
			System.out.printf("Tila will get.\n");
		} else {
			System.out.printf("Will be sold online.\n");
		}

	}

}
