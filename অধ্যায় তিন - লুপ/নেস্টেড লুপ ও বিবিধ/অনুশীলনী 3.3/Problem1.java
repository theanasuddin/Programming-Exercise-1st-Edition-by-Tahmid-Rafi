package programmingExercise;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n, counter = 1, mid, space_counter;

		// a.
		System.out.printf("a.\n");
		System.out.printf("input: ");
		n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = n; j > i + 1; j--) {
				System.out.printf(" ");
			}
			for (int k = 0; k < i + 1; k++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}

		// b.
		System.out.printf("b.\n");
		System.out.printf("input: ");
		n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = n; j > i + 1; j--) {
				System.out.printf(" ");
			}
			for (int k = 0; k < counter; k++) {
				System.out.printf("*");
			}
			System.out.printf("\n");

			counter += 2;
		}

		// c.
		System.out.printf("c.\n");
		System.out.printf("input: ");
		n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.printf(" ");
			}
			for (int k = i; k < n; k++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}

		// d.
		System.out.printf("d.\n");
		System.out.printf("input: ");
		n = scan.nextInt();
		counter = (n * 2) - 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.printf(" ");
			}
			for (int k = 0; k < counter; k++) {
				System.out.printf("*");
			}
			counter -= 2;
			System.out.printf("\n");
		}

		// e.
		System.out.printf("e.\n");
		System.out.printf("input: ");
		n = scan.nextInt();
		space_counter = n;
		counter = 1;
		n = (n * 2) - 1;
		mid = n / 2;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < space_counter; j++) {
				System.out.printf(" ");
			}
			for (int k = 0; k < counter; k++) {
				System.out.printf("*");
			}
			System.out.printf("\n");

			if (i < mid) {
				counter += 2;
				space_counter--;
			} else {
				counter -= 2;
				space_counter++;
			}
		}

		// f.
		System.out.printf("f.\n");
		System.out.printf("input: ");
		n = scan.nextInt();
		space_counter = n;
		counter = 1;
		n = (n * 2) - 1;
		mid = n / 2;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < space_counter; j++) {
				System.out.printf(" ");
			}
			for (int k = 0; k < counter; k++) {
				if (k == 0 || k == (counter - 1)) {
					System.out.printf("*");
				} else {
					System.out.printf(" ");
				}
			}
			System.out.printf("\n");

			if (i < mid) {
				counter += 2;
				space_counter--;
			} else {
				counter -= 2;
				space_counter++;
			}
		}

		// g.
		System.out.printf("g.\n");
		System.out.printf("input: ");
		n = scan.nextInt();
		scan.close();
		space_counter = n;
		counter = 1;
		n = (n * 2) - 1;
		mid = n / 2;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < space_counter; j++) {
				System.out.printf(" ");
			}
			for (int k = 0; k < counter; k++) {
				if (k % 2 == 0) {
					System.out.printf("*");
				} else {
					System.out.printf(" ");
				}
			}
			System.out.printf("\n");

			if (i < mid) {
				counter += 2;
				space_counter--;
			} else {
				counter -= 2;
				space_counter++;
			}
		}

	}
}
