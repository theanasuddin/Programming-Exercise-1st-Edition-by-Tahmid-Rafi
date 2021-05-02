package programmingExercise;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String key, message, encoded_message = "", alphabets = "abcdefghijklmnopqrstuvwxyz";

		System.out.printf("Key: ");
		key = scan.nextLine().substring(0, 26);
		System.out.printf("Message: ");
		
		while (scan.hasNext()) {
			message = scan.nextLine().toLowerCase();
			encoded_message = "";

			for (int i = 0; i < message.length(); i++) {
				char c = message.charAt(i);

				int index = 30;
				for (int j = 0; j < alphabets.length(); j++) {
					if (c == alphabets.charAt(j)) {
						index = j;
						break;
					}
				}

				if (index == 30) {
					encoded_message += c;
				} else {
					encoded_message += key.charAt(index);
				}
			}
			System.out.printf("Encoded Message: %s\n", encoded_message);
			System.out.printf("Message: ");
		}
	}
}
