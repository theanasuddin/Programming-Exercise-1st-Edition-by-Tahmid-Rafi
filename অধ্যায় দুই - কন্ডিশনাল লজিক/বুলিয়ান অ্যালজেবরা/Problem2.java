package programmingExercise;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean cut_grass, catch_fish, buy_saree;

		cut_grass = scan.nextBoolean();
		catch_fish = scan.nextBoolean();
		scan.close();

		buy_saree = cut_grass && catch_fish;

		System.out.printf("Buy Saree: %s\n", buy_saree);
	}

}
