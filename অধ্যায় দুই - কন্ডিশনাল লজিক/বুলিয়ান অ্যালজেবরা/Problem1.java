package programmingExercise;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int height;
		boolean need_ticket;

		height = scan.nextInt();
		scan.close();

		need_ticket = height >= 36;

		System.out.printf("Need Ticket: %s\n", need_ticket);
	}

}
