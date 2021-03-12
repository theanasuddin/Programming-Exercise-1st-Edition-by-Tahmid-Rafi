package programmingExercise;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int s, d;

		s = scan.nextInt();
		d = scan.nextInt();
		scan.close();
		System.out.printf("%d cm\n", s * d);

	}

}
