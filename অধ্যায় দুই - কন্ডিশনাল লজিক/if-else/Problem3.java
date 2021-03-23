package programmingExercise;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int alam, karim, cow1, cow2, cow3;

		cow1 = scan.nextInt();
		cow2 = scan.nextInt();
		cow3 = scan.nextInt();
		alam = cow1 + cow2 + cow3;

		cow1 = scan.nextInt();
		cow2 = scan.nextInt();
		cow3 = scan.nextInt();
		karim = cow1 + cow2 + cow3;
		scan.close();

		if (alam > karim) {
			System.out.printf("Alam\n");
		} else {
			System.out.printf("Karim\n");
		}

	}

}
