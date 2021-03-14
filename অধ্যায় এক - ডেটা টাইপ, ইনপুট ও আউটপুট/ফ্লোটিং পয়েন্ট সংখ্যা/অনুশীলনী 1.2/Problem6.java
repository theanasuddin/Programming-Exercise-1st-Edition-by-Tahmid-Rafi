package programmingExercise;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float diagonalOne, diagonalTwo, area;

		System.out.printf("Length of first diagonal: ");
		diagonalOne = scan.nextFloat();
		System.out.printf("Length of second diagonal: ");
		diagonalTwo = scan.nextFloat();
		scan.close();

		area = (diagonalOne * diagonalTwo) / 2;

		System.out.printf("Area: %.2f\n", area);
	}

}
