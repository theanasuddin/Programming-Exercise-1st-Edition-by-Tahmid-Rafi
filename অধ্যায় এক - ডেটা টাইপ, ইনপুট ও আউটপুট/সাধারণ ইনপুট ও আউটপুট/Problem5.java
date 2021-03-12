package programmingExercise;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a, b;

		a = scan.nextInt();
		b = scan.nextInt();
		scan.close();
		System.out.printf("%d\n", a + b);
		System.out.printf("%d\n", a - b);
		System.out.printf("%d\n", a * b);
		System.out.printf("%d\n", a / b);
		System.out.printf("%d\n", a % b);

	}

}
