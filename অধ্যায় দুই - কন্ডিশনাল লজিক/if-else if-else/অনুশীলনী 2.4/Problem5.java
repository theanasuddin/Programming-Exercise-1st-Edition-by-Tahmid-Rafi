package programmingExercise;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String grade;
		double marks;

		System.out.print("Enter marks: ");
		marks = scan.nextDouble();
		scan.close();

		if (marks >= 80 && marks <= 100) {
			grade = "A+";
		} else if (marks >= 70 && marks <= 79) {
			grade = "A";
		} else if (marks >= 60 && marks <= 69) {
			grade = "A-";
		} else if (marks >= 50 && marks <= 59) {
			grade = "B";
		} else if (marks >= 40 && marks <= 49) {
			grade = "C";
		} else if (marks >= 33 && marks <= 39) {
			grade = "D";
		} else if (marks >= 0 && marks <= 32) {
			grade = "F";
		} else {
			grade = "Invalid mark!";
		}

		System.out.printf("%s\n", grade);
	}
}
