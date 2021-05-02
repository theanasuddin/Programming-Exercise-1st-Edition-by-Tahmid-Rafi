package programmingExercise;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s1, s2, new_s = "";

		s1 = scan.nextLine();
		s2 = scan.nextLine();
		scan.close();

		for (int i = 0; i < s1.length(); i++) {
			new_s += Character.toString(s1.charAt(i));
			new_s += Character.toString(s2.charAt(i));
		}

		System.out.printf("%s", new_s);
	}
}
