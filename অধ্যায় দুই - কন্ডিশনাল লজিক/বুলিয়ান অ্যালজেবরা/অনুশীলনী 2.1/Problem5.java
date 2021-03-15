package programmingExercise;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean will_get_discount;
		int age, total_members;

		System.out.printf("How many members in the family?: ");
		total_members = scan.nextInt();

		for (int i = 0; i < total_members; i++) {
			System.out.printf("Member %d age: \n", i + 1);
			age = scan.nextInt();
			will_get_discount = (age < 12) || (age > 72);
			System.out.printf("Will get discount?: %s\n", will_get_discount);
		}
		scan.close();
	}

}
