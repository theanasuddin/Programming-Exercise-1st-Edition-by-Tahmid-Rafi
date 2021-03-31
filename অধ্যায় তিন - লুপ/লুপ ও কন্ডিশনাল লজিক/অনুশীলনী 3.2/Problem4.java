package programmingExercise;

import java.util.Scanner;

public class Problem4 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int[] numbers = new int[10]; 
		int 

		a = scan.nextInt();
		b = scan.nextInt();
		scan.close();

		product = a * b;

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

		System.out.println("LCM is: " + product / a);
	}
}