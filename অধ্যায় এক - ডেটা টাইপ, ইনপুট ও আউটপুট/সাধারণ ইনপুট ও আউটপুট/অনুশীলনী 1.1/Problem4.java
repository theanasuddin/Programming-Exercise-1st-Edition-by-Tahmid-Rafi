package programmingExercise;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int totalExams;

		System.out.printf("Total number of exams: ");
		totalExams = scan.nextInt();
		scan.close();
		System.out.printf("Total number of pens: %d\n", totalExams);

	}

}
