package programmingExercise;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean its_friday, cousin_came, pc_ok, go_to_field;

		its_friday = scan.nextBoolean();
		cousin_came = scan.nextBoolean();
		pc_ok = scan.nextBoolean();
		scan.close();

		go_to_field = its_friday && !(cousin_came && pc_ok);

		System.out.printf("Going to Field: %s\n", go_to_field);
	}

}
