package programmingExercise;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float marks_got, pass_marks;

		System.out.printf("Marks got: ");
		marks_got = scan.nextFloat();
		System.out.printf("Pass marks: ");
		pass_marks = scan.nextFloat();
		scan.close();

		if (marks_got >= pass_marks) {
			System.out.printf("Passed.\n");
		}

		if (marks_got < pass_marks) {
			System.out.printf("Failed.\n");
		}

	}

}
