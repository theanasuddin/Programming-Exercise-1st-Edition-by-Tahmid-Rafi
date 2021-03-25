package programmingExercise;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String n;

		System.out.print("Number: ");
		n = scan.next();
		scan.close();

		for (int i = n.length() - 1; i >= 0; i--) {
			System.out.printf("%c", n.charAt(i));
		}
	}

}
