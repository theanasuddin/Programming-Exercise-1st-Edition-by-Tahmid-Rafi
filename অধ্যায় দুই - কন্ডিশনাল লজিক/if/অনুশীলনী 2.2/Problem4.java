package programmingExercise;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N, P;

		System.out.printf("N: ");
		N = scan.nextInt();
		System.out.printf("P: ");
		P = scan.nextInt();
		scan.close();

		if (P >= N) {
			System.out.printf("Can go through the jungle.\n");
		}

		if (P < N) {
			System.out.printf("Can't go through the jungle.\n");
		}
	}

}
