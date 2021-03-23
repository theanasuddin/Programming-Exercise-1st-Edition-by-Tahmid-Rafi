package programmingExercise;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int bus, trawler, auto_rickshaw, money;

		bus = scan.nextInt();
		trawler = scan.nextInt();
		auto_rickshaw = scan.nextInt();
		money = scan.nextInt();
		scan.close();

		if (money >= auto_rickshaw) {
			System.out.printf("Autorickshaw.\n");
		} else if (money >= trawler) {
			System.out.printf("Trawler.\n");
		} else if (money >= bus) {
			System.out.printf("Bus.\n");
		} else {
			System.out.printf("Walk.\n");
		}

	}

}
