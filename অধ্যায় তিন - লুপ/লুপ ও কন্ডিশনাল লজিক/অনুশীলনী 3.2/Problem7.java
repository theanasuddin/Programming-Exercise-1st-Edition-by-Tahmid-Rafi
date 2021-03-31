package programmingExercise;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String password;
		int num, shift_count;

		System.out.printf("Password: ");
		password = scan.next();
		System.out.printf("Shift count: ");
		shift_count = scan.nextInt();
		scan.close();

		for (int i = 0; i < 10; i++) {
			num = password.charAt(i) + shift_count;

			if (num > 122) {
				num -= 122;
				num += 96;
			}
			System.out.printf("%c", num);
		}
	}

}
