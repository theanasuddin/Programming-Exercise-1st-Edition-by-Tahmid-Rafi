package programmingExercise;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// solving 5th exercise problem from previous chapter using if-else
		Scanner scan = new Scanner(System.in);
		int a, b, c, largest;

		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		scan.close();

		if (a > b) {
			if (a > c) {
				System.out.printf("%d\n", a);
			} else {
				System.out.printf("%d\n", c);
			}
		} else {
			if (b > c) {
				System.out.printf("%d\n", b);
			} else {
				System.out.printf("%d\n", c);
			}
		}

		if (a > b) {
			largest = a;
		} else {
			largest = b;
		}

		if (c > largest) {
			largest = c;
		}

		System.out.printf("%d\n", largest);
	}
}
