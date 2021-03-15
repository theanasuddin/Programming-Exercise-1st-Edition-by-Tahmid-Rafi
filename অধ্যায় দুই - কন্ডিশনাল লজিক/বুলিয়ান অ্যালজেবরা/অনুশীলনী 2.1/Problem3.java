package programmingExercise;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean can_eat_biryani;
		float total_money = 0;

		for (int i = 0; i < 3; i++) {
			System.out.printf("Friend %d giving (tk): \n", i + 1);
			total_money = total_money + scan.nextFloat();
		}
		scan.close();

		can_eat_biryani = total_money >= 375;

		System.out.printf("Can Eat Biryani?: %s\n", can_eat_biryani);
	}

}
