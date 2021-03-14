package programmingExercise;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char c;

		c = scan.next().charAt(0);
		scan.close();

		System.out.printf("%c\n", c + 32);

		// or, more safer one
		System.out.printf("%c\n", Character.toLowerCase(c));
	}

}
