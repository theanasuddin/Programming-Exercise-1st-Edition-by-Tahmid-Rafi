package programmingExercise;

import java.util.Scanner;

public class Problem12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] numbers = new int[4];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scan.nextInt();
		}
		scan.close();

		int smallestNumber;
		int index;
		int temp;
		for (int i = 0; i < numbers.length; i++) {
			smallestNumber = numbers[i];
			index = i;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j] < smallestNumber) {
					smallestNumber = numbers[j];
					index = j;
				}
			}
			temp = numbers[i];
			numbers[i] = smallestNumber;
			numbers[index] = temp;
		}

		for (int i : numbers) {
			System.out.printf("%d\t", i);
		}

	}

}
