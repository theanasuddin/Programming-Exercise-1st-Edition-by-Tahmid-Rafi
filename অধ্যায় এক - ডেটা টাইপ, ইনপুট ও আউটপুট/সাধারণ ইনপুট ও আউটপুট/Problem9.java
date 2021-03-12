package programmingExercise;

import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input;

		input = scan.nextInt();
		scan.close();
		System.out.printf("%s\n", Integer.toHexString(input));
	}

}
