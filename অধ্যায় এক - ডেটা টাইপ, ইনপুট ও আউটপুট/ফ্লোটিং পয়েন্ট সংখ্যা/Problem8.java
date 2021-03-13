package programmingExercise;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		NumberFormat formatter = new DecimalFormat("0.000000E000");
		double input;

		input = scan.nextDouble();
		scan.close();

		System.out.printf("%e\n", input);
		System.out.printf("%s\n", formatter.format(input));
	}

}
