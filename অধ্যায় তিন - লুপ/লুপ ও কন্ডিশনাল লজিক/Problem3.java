package programmingExercise;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a, b, temp;

		a = scan.nextInt();
		b = scan.nextInt();
		scan.close();

		if (b > a) {
			temp = a;
			a = b;
			b = temp;
		}

		while (a != b) {
			if (b == 0) {
				break;
			}
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}

		System.out.println("GCD is: " + a);
	}
}