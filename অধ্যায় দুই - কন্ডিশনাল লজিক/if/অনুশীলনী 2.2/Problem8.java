package programmingExercise;

import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int total_friends = 6, a, b, c;
		boolean can_go;

		System.out.printf("a: ");
		a = scan.nextInt();
		System.out.printf("b: ");
		b = scan.nextInt();
		System.out.printf("c: ");
		c = scan.nextInt();
		scan.close();

		can_go = (a * total_friends) >= (b + c);

		if (can_go) {
			System.out.printf("Can go to picnic.\n");
		}

		if (!can_go) {
			System.out.printf("Can't go to picnic.\n");
		}
	}

}
