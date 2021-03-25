package programmingExercise;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double x, y, z, m, total_book_price;
		String book_names = "";
		int max_number_of_books = 0;

		System.out.print("Computer programming part 1 book price (x): ");
		x = scan.nextDouble();
		System.out.print("Gonit korbo joy book price (y): ");
		y = scan.nextDouble();
		System.out.print("Programming er ashchorjo jogot book price (z): ");
		z = scan.nextDouble();
		System.out.print("Total amount of money i have (m): ");
		m = scan.nextDouble();
		scan.close();

		total_book_price = x + y + z;

		if (m >= total_book_price) {
			max_number_of_books = 3;
			book_names = "Computer programming part 1, Gonit korbo joy, Programming er ashchorjo jogot";
		} else if (m >= (x + y) || m >= (y + z) || m >= (x + z)) {
			max_number_of_books = 2;
			if (m >= (x + y)) {
				book_names = "Computer programming part 1, Gonit korbo joy";
			} else if (m >= (y + z)) {
				book_names = "Gonit korbo joy, Programming er ashchorjo jogot";
			} else if (m >= (x + z)) {
				book_names = "Computer programming part 1, Programming er ashchorjo jogot";
			}
		} else if (m >= x || m >= y || m >= z) {
			max_number_of_books = 1;
			if (m >= x) {
				book_names = "Computer programming part 1";
			} else if (m >= y) {
				book_names = "Gonit korbo joy";
			} else if (m >= z) {
				book_names = "Programming er ashchorjo jogot";
			}
		}

		if (max_number_of_books != 0) {
			System.out.printf("Max number of books i can buy: %d\nBook names: %s", max_number_of_books, book_names);
		} else {
			System.out.printf("I can't buy any book");
		}
	}
}
