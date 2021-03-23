package programmingExercise;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a, b;

		a = scan.nextInt();
		b = scan.nextInt();
		scan.close();

		if (a > b) {
			System.out.printf("a is greater than b.\n");
		} else if (b > a) {
			System.out.printf("b is greater than a.\n");
		} else {
			System.out.printf("a and b are equal.\n");
		}

	}

}
