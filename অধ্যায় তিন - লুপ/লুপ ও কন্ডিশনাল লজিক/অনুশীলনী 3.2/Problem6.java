package programmingExercise;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String password;
		int num;

		password = scan.next();
		scan.close();

		for (int i = 0; i < 10; i++) {
			num = password.charAt(i) + 2;

			if (num > 122) {
				num -= 122;
				num += 96;
			}
			System.out.printf("%c", num);
		}

	}
}
