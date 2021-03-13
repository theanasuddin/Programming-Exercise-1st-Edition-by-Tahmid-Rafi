package programmingExercise;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int e, b;

		System.out.printf("Total number of eggs bought: ");
		e = scan.nextInt();
		System.out.printf("Total number of broken eggs: ");
		b = scan.nextInt();
		scan.close();
		System.out.printf("Number of eggs left intact: %d\n", (e - b));

	}

}
