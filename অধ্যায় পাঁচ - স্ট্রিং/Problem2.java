package programmingExercise;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String n1, n2, sum = "";
		int n1_len, n2_len, max_len, i;

		n1 = scan.next();
		n2 = scan.next();
		scan.close();

		n1_len = n1.length();
		n2_len = n2.length();

		if (n1_len > n2_len) {
			max_len = n1_len;
		} else {
			max_len = n2_len;
		}

		n1 = new StringBuilder(n1).reverse().toString();
		for (i = n1_len; i < max_len; i++) {
			n1 += "0";
		}

		n2 = new StringBuilder(n2).reverse().toString();
		for (i = n2_len; i < max_len; i++) {
			n2 += "0";
		}

		int carry = 0;
		for (i = 0; i < max_len; i++) {
			int s = carry + Character.getNumericValue(n1.charAt(i)) + Character.getNumericValue(n2.charAt(i));
			sum += (s % 10);
			carry = s / 10;
		}

		if (carry == 1) {
			sum += carry;
		}

		sum = new StringBuilder(sum).reverse().toString();
		System.out.printf("%s\n", sum);
	}
}
