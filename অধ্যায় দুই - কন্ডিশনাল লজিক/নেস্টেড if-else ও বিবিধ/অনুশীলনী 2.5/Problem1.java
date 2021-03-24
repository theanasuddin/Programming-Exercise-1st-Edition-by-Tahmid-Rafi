package programmingExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		for (int i = 0; i < 4; i++) {
			numbers.add(scan.nextInt());
		}
		scan.close();

		Collections.sort(numbers);

		System.out.printf("%d\n", numbers.get(numbers.size() - 2));
	}
}
