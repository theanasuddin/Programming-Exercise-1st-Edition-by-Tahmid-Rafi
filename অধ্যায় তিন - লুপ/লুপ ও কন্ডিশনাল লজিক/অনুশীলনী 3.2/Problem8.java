package programmingExercise;

import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n, vowel_count = 0, consonant_count = 0, letter_count = 0, digit_count = 0, punctuation_count = 0,
				others = 0;
		char c;
		String vowels = "AaEeIiOoUu";
		String punctuations = ".?!,;:-—(){}[]‘’“”";

		n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			c = scan.next().charAt(0);

			if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
				letter_count++;
				if (vowels.contains(Character.toString(c))) {
					vowel_count++;
				} else {
					consonant_count++;
				}
			} else if (c >= 48 && c <= 57) {
				digit_count++;
			} else if (punctuations.contains(Character.toString(c))) {
				punctuation_count++;
			} else {
				others++;
			}
		}
		scan.close();

		System.out.printf("Vowels: %d\nConsonants: %d\nLetters: %d\nDigits: %d\nPunctuations: %d\nOthers: %d",
				vowel_count, consonant_count, letter_count, digit_count, punctuation_count, others);
	}

}
