package programmingExercise;

import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n;

		System.out.print("Number: ");
		n = scan.nextInt();
		scan.close();

		System.out.printf("Binary is: %s\n", Integer.toBinaryString(n));

	}

}
